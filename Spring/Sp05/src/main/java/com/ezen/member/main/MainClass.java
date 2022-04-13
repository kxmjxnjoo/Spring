package com.ezen.member.main;

import com.ezen.member.dto.Student;
import com.ezen.member.service.SpringContainerClass;
import com.ezen.member.service.StudentInsertService;
import com.ezen.member.service.StudentSelectOneService;
import com.ezen.member.service.StudentUpdateService;

public class MainClass {

	public static void main(String[] args) {
		
		SpringContainerClass scc = new SpringContainerClass();
		
		//StudentInsertService sis = new StudentInsertService();
		StudentInsertService sis = scc.getIs(); //위 대신 이와 같이 사용 가능함
		
		//Student std = new Student("H9asdfaelu42o23", "hippo", "94875", "barbara", 27, "W", "Korean Literature");
		//sis.insertStudent(std);
		//Student std = new Student("H39iiemamca8w9h4", "raccoon", "15284", "chris", 20, "W", "French Literature");
		//sis.insertStudent(std);
		
		//StudentSelectService sss = new StudentSelectService();
		/*
		StudentSelectService sss = scc.getSs();
		
		sss.selectStudent();
		ArrayList<Student> list = sss.selectStudent();
		
		for(int i=0; i<list.size(); i++) {
			System.out.print("| sNum : " + list.get(i).getsNum() + "\t");
			System.out.print("| sId : " + list.get(i).getsId() + "\t");
			System.out.print("| sPw : " + list.get(i).getsPw() + "\t");
			System.out.print("| sName : " + list.get(i).getsName() + "\t");
			System.out.print("| sAge : " + list.get(i).getsAge() + "\t");
			System.out.print("| sGender : " + list.get(i).getsGender() + "\t");
			System.out.print("| sMajor : " + list.get(i).getsMajor() + "\n");
		}
		System.out.println();
		*/
		
		//StudentSelectOneService ssos = new StudentSelectOneService();
		StudentSelectOneService ssos = scc.getSsos();
		Student std = ssos.selectOneService("H39iiemamca8w9h4");
			System.out.print("| sNum : " + std.getsNum() + "\t");
			System.out.print("| sId : " + std.getsId() + "\t");
			System.out.print("| sPw : " + std.getsPw() + "\t");
			System.out.print("| sName : " + std.getsName() + "\t");
			System.out.print("| sAge : " + std.getsAge() + "\t");
			System.out.print("| sGender : " + std.getsGender() + "\t");
			System.out.print("| sMajor : " + std.getsMajor() + "\n");
			
			//한명의 데이터를 수정한 후에 : StudentUpdateService 클래스의 인스턴스를 얻어 수정 메소드를 호출함
			StudentUpdateService sus = scc.getSus();
			std.setsNum("H39iiemamca8w9h4");
			std.setsId("raccon");
			std.setsMajor("Korean Literature");
			std.setsAge(25);
			std.setsGender("M");
			sus.updateStudent(std);
			//다시 출력
			std = ssos.selectOneService("H39iiemamca8w9h4");

			System.out.print("| sNum : " + std.getsNum() + "\t");
			System.out.print("| sId : " + std.getsId() + "\t");
			System.out.print("| sPw : " + std.getsPw() + "\t");
			System.out.print("| sName : " + std.getsName() + "\t");
			System.out.print("| sAge : " + std.getsAge() + "\t");
			System.out.print("| sGender : " + std.getsGender() + "\t");
			System.out.print("| sMajor : " + std.getsMajor() + "\n");
		
	}
}