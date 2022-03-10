package com.ezen.word;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.word.dto.WordSet;
import com.ezen.word.service.WordInsertService;
import com.ezen.word.service.WordSearchService;

public class MainClass {
	
	public static void main(String[] args) {
		
		String[] keyWords = {"c", "c++", "java", "jsp", "spring"};
		
		String[] values = {
				"C는 1972년 켄 톰슨과 데니스 리치가 유닉스 운영 체제에서 사용하기 위해 개발한 프로그래밍 언어이다",
				"C++는 AT&T 벨 연구소의 비야네 스토롭스트룹이 1983년 발표하여 발전한 프로그래밍 언어이다",
				"자바는 썬마이크로시스템즈의 제임스 James Gosling과 다른 연구원들이 개발한 객체 지향적 프로그래밍 언이이다",
				"JSP는 HTML내에 자바코드를 삽입하여 웹 서버에서 동적으로 웹 페이지를 생성하여 웹 프라우저에 돌려주는 언어이다",
				"스프링 프레임워크는 자바 플랫폼을 위한 오픈소스 애플리케이션 프레임워크로서 간단히 스프링이라고도 불린다"
		};
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		WordInsertService wis = ctx.getBean("insertService", WordInsertService.class);
		/*
		for(int i=0; i<values.length; i++) {
			WordSet wordSet = new WordSet(keyWords[i], values[i]);
			wis.insert(wordSet);
		}
		*/
		
		
		WordSearchService ss = ctx.getBean("searchService", WordSearchService.class);
		WordSet ws = ss.searchWord("jsp");
		if(ws==null) {
			System.out.println("검색한 단어가 존재하지 않습니다");
		}else {
		System.out.println("\n\n-----------------------------------------------------------------------------------------------------");
		System.out.println(ws.getWordKey() + "\t: ");
		System.out.println(ws.getWordValue());
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		ctx.close();
		}
	}
}