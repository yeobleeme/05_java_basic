package com.lec.ex06_type_change.method;

import com.lec.ex06_type_change.typechange.Parent;

public class Child extends Parent {
	
	@Override
	public void method2() {
		System.out.println("Child.method2() called");
	}
	
	public void method3() {
		System.out.println("Child.method3() called");

	}

}
