package com.ezen.member.service;

import com.ezen.member.dao.StudentDao;
import com.ezen.member.dto.Student;

public class StudentUpdateService {
	
	StudentDao sdao;
	
	public StudentUpdateService(StudentDao sdao) {
		this.sdao = sdao;
	}
	
	public void updateStudent(Student std) {
		sdao.updateStudent(std);
	}
}