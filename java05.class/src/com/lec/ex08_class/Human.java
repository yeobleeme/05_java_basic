package com.lec.ex08_class;

// 인터페이스 - 모든 메서드가 추상 메서드로 구성
public interface Human {
	
	// 인터페이스에 선언된 필드(속성)는 상수로 정의해야 한다.
	// final 생략, 기본값 
	// 상수는 초기화가 되어야 한다. 그렇지 않을 경우 에러.
	// 상수는 대문자로 선언하는 것이 관례
	String NATION = "";
	String NAME = "";
	String GENDER = "";
	int AGE = 0;
	
	// 인터페이스의 메서드는 전부 추상메서드이다.
	// abstract 생략, 기본값
	void speak(String lang);
	void move();
	void think();

}









