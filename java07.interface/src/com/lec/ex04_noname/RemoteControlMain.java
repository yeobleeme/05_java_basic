package com.lec.ex04_noname;

import com.lec.ex02_implement.RemoteControl;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		// 1. 인터페이스는 객체 생성 불가
//		RemoteControl rc = new RemoteControl();
		
		// 2. 익명구현 객체
		RemoteControl tv = new RemoteControl() {
			
			@Override
			public void turnOn() { System.out.println("turn on"); }
			
			@Override
			public void turnOff() { System.out.println("turn off"); }
			
			@Override
			public void setVolumn(int volumn) { System.out.println("now volumn is " + volumn); }
		};
		
		tv.turnOn();
		tv.setVolumn(100);
		tv.turnOff();
//		tv.changeBattery();
		RemoteControl.changeBattery();
		System.out.println();
		
		
		RemoteControl audio = new RemoteControl() {
			
			@Override
			public void turnOn() {}
			
			@Override
			public void turnOff() {}
			
			@Override
			public void setVolumn(int volumn) {}
		};
		
		audio.turnOn();
		audio.setVolumn(100);
		audio.turnOff();
//		audio.changeBattery();
		RemoteControl.changeBattery();
		System.out.println();
		
		
		
		RemoteControl radio = new RemoteControl() {
			public void turnOn() { System.out.println("라디오 파워온"); }
			public void turnOff()  { /* 실행블럭 */ }
			public void setVolumn(int volumn)  { /* 실행블럭 */ }
		}; 
		radio.turnOn();
		
		RemoteControl cd = new RemoteControl() {
			public void turnOn() { System.out.println("CD 파워온"); }
			public void turnOff()  { /* 실행블럭 */ }
			public void setVolumn(int volumn)  { /* 실행블럭 */ }
		};
		cd.turnOn();
		
		RemoteControl amp = new RemoteControl() {
			public void turnOn() { System.out.println("AMP 파워온"); }
			public void turnOff()  { /* 실행블럭 */ }
			public void setVolumn(int volumn)  { /* 실행블럭 */ }
		};
		amp.turnOn();
		

	}

}





