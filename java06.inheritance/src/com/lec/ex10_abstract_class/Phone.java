package com.lec.ex10_abstract_class;

public abstract class Phone {
	
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메서드
	public void powerOn() { System.out.println("powerOn"); }
	public void powerOff() { System.out.println("powerOff"); }

}
