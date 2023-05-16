package com.lec.ex02_implement;

public class RemoteControlMain {

	public static void main(String[] args) {
		
//		Television tv = new Television();
//		Audio audio = new Audio();
		
		RemoteControl rc;  // 통합 리모콘
		rc = new Television();  // Tv 리모콘 기능 수행
		rc.turnOn();
		rc.setVolumn(5);
		rc.setMute(true);		
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();  // Audio 리모콘 기능 수행
		rc.turnOn();
		rc.setVolumn(20);
		rc.setMute(true);		
		rc.turnOff();
		
		System.out.println();
		
		//배터리 교체 static method
		RemoteControl.changeBattery();
		

	}

}
