package com.ezen.word.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.word.dao.WordDao;
import com.ezen.word.dto.WordSet;

public class WordInsertService {
	
	@Autowired
	private WordDao worddao;
	
	//public WordInsertService(WordDao wdao) {
	//	this.wdao = wdao;
	//}
	public void insert(WordSet wordSet) {
		worddao.insert(wordSet);
	}
}