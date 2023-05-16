package com.lec.ex05_class;

public class Eve extends Human {
	
	String job = "변호사";
	
	void makeBaby() {
		System.out.println("임신을 합니다.");
	}

	@Override
	void move() {
		
		System.out.println("요리를 합니다.");

	}

	@Override
	public String toString() {
		return this.name +", "+ this.gender;
	}


	
	

}
