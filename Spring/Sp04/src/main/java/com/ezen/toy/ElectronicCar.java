package com.ezen.toy;

import com.ezen.battery.Battery;
import com.ezen.battery.NormalBattery;

public class ElectronicCar {
	private Battery bat; //인터페이스 레퍼런스 변수 - 배터리 변수가 멤버변수
	
	public ElectronicCar() {//생성자에서 노멀배터리를 멤버변수 초기값으로 대입하고 시작
		bat = new NormalBattery();
		//인터페이스 멤버변수에 battery를 implements한 class를 대입
	}
}
//이 장난감은 내장배터리로 교체가 불가능한 형태임