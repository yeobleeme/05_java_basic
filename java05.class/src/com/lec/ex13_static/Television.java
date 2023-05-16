package com.lec.ex13_static;

public class Television {
	
	/*
	    정적 초기화 블럭
	    
	    정적 초기화 블럭은 클래스가 메모리로 로딩될 때 자동으로 실행되는 블럭이다.
	    정적 블럭은 클래스 내부에 복수개 선언도 가능하다.
	    
	    정적 블럭은 클래스가 메모리로 로딩될 때 선언된 순서로 실행된다.
	*/
	
	static String company = "LGE";
	static String model = "OLED";
	static String info;  // LGE-OLED
	int year;  
	
	
	static {
		info = company + "-" + model;
	}
	
	static {
		// 정적 블럭에서는 객체 필드에 접근 불가
//		year = 2023;
	}
	

}
