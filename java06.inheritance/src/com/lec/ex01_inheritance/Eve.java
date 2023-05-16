package com.lec.ex01_inheritance;

public class Eve extends Human {

	String bag = "샤넬";
	String cloth = "에르메스";
	
	@Override
	public String toString() {	
		return "Eve [name=" + name + ", gender=" + gender + ", age=" + age + ", " 
	                        +  this.bag + ", " + this.cloth + "]";
	}
	
	@Override
	void speak() {
		System.out.println("천국말을 합니다.");
	}

	@Override
	void move() {
		System.out.println("요리를 합니다.");
	}
	
	void makeBaby() {
		System.out.println(this.name + " 아기를 갖습니다.");
	}
	
	
	
	
	
	

}
