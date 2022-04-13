package com.ezen.toy;

import com.ezen.battery.Battery;

public class ElectronicRadio {
	private Battery bat;
	
	public ElectronicRadio(Battery bat) {
		//생성자에서 배터리 초기화 되는데, 그 초기값이 생성자의 전달인수로 전달되는 형태
		this.bat = bat;
	}

	public void getBattery(Battery battery) {
		this.bat = battery;
	} 
} //배터리가 교체 가능한 장난감