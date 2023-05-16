package com.lec.ex13_static;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("PI = " + Calculator.PI);
//		System.out.println("PI = " + Calculator.pi);  // 접근 불가
		System.out.println(Calculator.add(10, 10));
//		System.out.println(Calculator.mul(10, 10));   // 접근 불가
//		Calculator.PI = 100;  // 상수: 수정 불가
		
		System.out.println();
		
		Calculator cal = new Calculator();
		System.out.println("pi = " + cal.pi);  // 객체 멤버로서 접근 가능
		System.out.println(cal.mul(10, 10));
		cal.pi = 1000.5;
		System.out.println("pi = " + cal.pi);  // 객체 멤버로서 접근 가능
		
		// 객체에서 정적 멤버 접근 가능?
		// 접근은 가능하지만 static멤버는 class로 접근하는 것을 권장
		System.out.println("객체에서 정적 멤버 PI 접근 = " + cal.PI);
		System.out.println("객체에서 정적 멤버 add 호출 = " + cal.add(1, 2));
		
		
//		CalculatorMain calxxx = new CalculatorMain();
//		calxxx.xxx();
		yyy();

	}
	
	void xxx() {}
	static void yyy() {}

}













