package com.lec.ex02_supercall;

public class People {
	
	String name;
	String ssn;
	
	public People() {
		super();  // Object 기본 생성자를 호출
	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

}
