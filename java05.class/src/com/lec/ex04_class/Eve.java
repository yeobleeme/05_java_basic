package com.lec.ex04_class;

public class Eve {
	
	String name = "이브";
	String gender = "여자";
	int age = 9999;
	
	
	void speak() {
		System.out.println("말을 합니다.");
	}
	
	String move() {
		return "요리를 합니다.";
	}

	public String xxString() {
		return "Eve [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	@Override
	public String toString() {
		return "Eve [name=" + name + ", gender=" + gender + "]";
	}
	
	

}
