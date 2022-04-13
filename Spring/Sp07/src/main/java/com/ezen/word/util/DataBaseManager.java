package com.ezen.word.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

public class DataBaseManager {

	@Autowired //해당 클래스의 bean을 스프링 컨테이너에서 검색, 자동 주입진행함
	private DataBaseUserinfo dbi ;
	
	//private DataBaseManager (DataBaseUserinfo dbi) {
	//	this.dbi = dbi;
	//}   생성자도 없어져야 한다
	
	public Connection getConnection() {
		Connection con=null;
		try {
			Class.forName(dbi.getDriver());
			con = DriverManager.getConnection(dbi.getUrl(), dbi.getId(), dbi.getPw());
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (SQLException e) {e.printStackTrace(); }
		return con;
		}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(con != null) con.close();
			if( pstmt != null) pstmt.close();
			if( rs != null) rs.close();
		} catch (SQLException e) {e.printStackTrace(); }
	}
}