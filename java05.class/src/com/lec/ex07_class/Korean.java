package com.lec.ex07_class;

//추상 클래스를 상속받을 경우 추상 메서드는 반드시 구현해야 한다.
public class Korean extends Human {

	@Override
	void speak() {
		System.out.println("한국어로 말을 합니다.");
		
	}

	@Override
	void move() {
		System.out.println("김치를 만듭니다.");
		
	}

	@Override
	public String toString() {
		return "Korean [nation=" + nation + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
