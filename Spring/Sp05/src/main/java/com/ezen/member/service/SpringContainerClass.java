package com.ezen.member.service;

import com.ezen.member.dao.StudentDao;

public class SpringContainerClass {
	
	private StudentDao sdao;

	private StudentSelectService ss;
	private StudentInsertService is;
	private StudentSelectOneService ssos;
	private StudentUpdateService sus;
	
	public SpringContainerClass(){ //new 인스턴스를 생성하는 생성자
		sdao = new StudentDao();
		ss = new StudentSelectService(sdao);
		is = new StudentInsertService(sdao);
		ssos = new StudentSelectOneService(sdao);
		sus = new StudentUpdateService(sdao);
	}
	
	
	public StudentUpdateService getSus() {
		return sus;
	}
	public StudentSelectService getSs() { //보관된 객체를 리턴해주는 getter메소드(getBean의 역활)
		return ss;	
	}
	public StudentInsertService getIs() {  //보관된 객체를 리턴해주는 getter메소드(getBean의 역활)
		return is;
	}
	public StudentSelectOneService getSsos() {
		return ssos;
	}
}