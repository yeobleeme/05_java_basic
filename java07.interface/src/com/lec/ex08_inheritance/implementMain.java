package com.lec.ex08_inheritance;

public class implementMain {

	public static void main(String[] args) {
		
		implementC im = new implementC();
		im.methodA();
		im.methodB();
		im.methodC();
		System.out.println();
		
		A ia = im;  // IntefaceA로 자동형변환
		ia.methodA();
//		ia.methodB();
//		ia.methodC();
		System.out.println();
		
		B ib = im;  // InterfaceB로 자동형변환
//		ib.methodA();
		ib.methodB();
//		ib.methodC();
		System.out.println();
		
		C ic = im;  // InterfaceC로 자동형변환
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();

	}

}




