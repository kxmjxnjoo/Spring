package com.ezen.sp03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//일반적인 클래스의 객체 생성 사용의 예
		WalkClass wc = new WalkClass();
		wc.move();
		
		//스프링 프레임워크에서의 클래스 객체 생성과 운영방법
		//필요할 때 new 인스턴스 생성하지 않고 프로그램 시작시 미리 생성
		
		//보관하고 있다가 필요할 때 꺼내 사용함(보관장소 : 스프링 컨테이너)
		//현재 프로젝트에서 사용할 컨테이너 -> applicationContext.xml
		
		//applicationContext.xml의 기본위치 -> src-main-resources폴더
		
		//스프링 컨테이너에 담겨있는 객체(Bean)을 꺼내 쓰려면
		//사용권한을 가지고 있는 객체를 생성하여 사용함
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//스프링 컨테이너에서 bean을 꺼내 쓸 수 있는 기능이 있는 객체 생성
		
		//방법: 기본 new인스턴스를 레퍼런스 변수에 저장하듯 ctx로 bean을 레퍼런스 변수에 저장
		WalkClass wc2 = ctx.getBean("cWalk", WalkClass.class);
		//cWalk : 스프링 컨테이너 내부에 있는 클래스의 id 값
		//WalkClass.class : 스프링 컨테이너 내부에 있는 클래스의 이름
		wc2.move();
		ctx.close();
		
		//아직까지 일반 자바 프로젝트에서 사용하는 new WalkClass()와 사용 상 차이점은 
		//없어보이지만 new 인스턴스를 계속사용하게되면 새로운 인스턴스가 계속 생성되는 반면
		//getBean()은 싱글톤 방식처럼 하나의 생성된 객체가 계속 사용된다는 점의 차이가 있음
		//getBean()으로 같은 클래스의 다른 인스턴스를 두개 사용해야한다면 다른 id 값으로
		//Bean을 두개 추가하여 사용함
		//<bean class="com.ezen.spcon.WalkClass" id="cWalk2"></bean>
	}
}