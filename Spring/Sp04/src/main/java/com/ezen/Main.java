package com.ezen;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.battery.ChargeBattery;
import com.ezen.battery.NormalBattery;
import com.ezen.toy.ElectronicCar;
import com.ezen.toy.ElectronicRadio;

public class Main {

	public static void main(String[] args) {
		
	//일반적인 사용 예
	//배터리가 일체형 -> 객체생성만으로 사용가능ㄴ
	ElectronicCar carToy1 = new ElectronicCar();
	
	//ElectronicRadio radioToy = new ElectronicRadio(); 에러
	//생성자에 배터리 객체가 전달되어야하며 매개변수가 있는 생성자가 실행되므로
	NormalBattery nbatt1 = new NormalBattery();
	ChargeBattery cbatt1 = new ChargeBattery();
	ElectronicRadio radioToy1 = new ElectronicRadio(nbatt1);
	
	GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
	ElectronicCar carToy2 = ctx.getBean("car", ElectronicCar.class);
	ElectronicRadio radioToy2 = ctx.getBean("radio", ElectronicRadio.class);
	radioToy2.getBattery(nbatt1);
	
	//스프링 프레임워크의 클래스 사용이 업그레이드되어 간편해짐
	}

}
