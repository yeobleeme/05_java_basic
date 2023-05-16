package com.lec.ex07_class;

// 추상 클래스 - 객체를 생성할 수 없는 클래스
public abstract class Human {
	
	String nation;
	String name;
	String gender;
	int age;
	
    // 추상 메서드 - 실행 블럭이 없는 메서드
	abstract void speak();
	abstract void move();
	void think() {
		System.out.println("생각을 합니다.");
	}
	

}
