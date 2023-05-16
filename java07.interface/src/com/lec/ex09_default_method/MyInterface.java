package com.lec.ex09_default_method;

public interface MyInterface {
	
	void method1();
	
	default void method2() {
		System.out.println("new function added 1 year later");
	}
	
	default void method3() {
		System.out.println("new function added 2 year later");
	}

}
