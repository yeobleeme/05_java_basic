package com.lec.ex10_abstract_class;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	
	public void internetSearch(String url) {
		System.out.println(url + " internet searching");

	}
	
	

}
