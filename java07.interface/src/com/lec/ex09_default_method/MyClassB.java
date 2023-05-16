package com.lec.ex09_default_method;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB.method1() called");
		
	}
	
	@Override
	public void method3() {
		System.out.println("new function added 3 year later");
	}

}
