package com.ezen.word.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.word.dto.WordSet;
import com.ezen.word.util.DataBaseManager;

public class WordDao {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Autowired
	DataBaseManager dbm;
	
	//public WordDao(DataBaseManager dbm) {
	//	this.dbm = dbm;
	//}

	public void insert(WordSet wordSet) {
		String sql = "insert into wordset values(?, ?)";
		con = dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, wordSet.getWordKey());
			pstmt.setString(2, wordSet.getWordValue());
			pstmt.executeUpdate();
		} catch (SQLException e) { 	e.printStackTrace();
		} finally {	dbm.close(con, pstmt, rs);		}
		//이렇게 사용하기 위해 DBM, DBU를 사용한 것
	}

	public WordSet search(String kw) {
		WordSet ws = null;
		String sql = "select * from wordset where wordkey=?";
		con = dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, kw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ws = new WordSet(
					rs.getString("wordkey"),
					rs.getString("wordvalue")
				);
			}
		} catch (SQLException e) {	e.printStackTrace();
		} finally {dbm.close(con, pstmt, rs);		}
		return ws;
	}
}
