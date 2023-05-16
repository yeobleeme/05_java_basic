package com.lec.ex06_class;

public class Eve extends Human {
	
	String gender = "여자";

	@Override
	void move() {
		
		System.out.println("요리를 합니다.");

	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
	
	

}
