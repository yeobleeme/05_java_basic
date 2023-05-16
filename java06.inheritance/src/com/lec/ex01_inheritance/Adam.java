package com.lec.ex01_inheritance;

public class Adam extends Human {

	@Override
	public String toString() {
		return "Adam [toString()=" + super.toString() + "]";
	}

	@Override
	void speak() {
		super.speak();
	}

	@Override
	void move() {
		System.out.println(this.name + " 사냥을 합니다.");
	}
	
	
	
	

}
