package com.lec.ex01_inheritance;

public class American extends Eve {

	@Override
	public String toString() {
		return "나는 미국사람 입니다. 나의 이름은 " + this.name + " 입니다."; 
	}
	
	@Override
	void speak() {
//		super.speak();  // super -> Eve.speak()
		System.out.println("영어로 말을 합니다.");
	}
	
	@Override
	void move() {
		System.out.println("다이어트를 합니다.");
	}
	
	@Override
	void makeBaby() {
		System.out.println("싱글 입니다.");
	}
	
	

}
