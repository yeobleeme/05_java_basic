package com.lec.ex02_variables;

public class LiteralMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 직접 입력(표현)된 값
		
		// 10진수
		int var1 = 10;  // 10은 literal, var1은 변수
		System.out.println("10진수 = " + var1);
		
		//  8진수 : 수수자 맨 앞에 0으로 시작되는 리터럴
		int var2 = 010;
		System.out.println(" 8진수 = " + var2);
		
		// 16진수
		int var3 = 0x10;
		System.out.println("16진수 = " + var3);
		
		//  2진수
		int var4 = 0b10;
		System.out.println(" 2진수 = " + var4);
		System.out.println();
		
		// 서로 다른 데이터 타입의 연산
		char c1 = 'A';
		int i1 = 10;
		System.out.println("c1 + i1 = " + (c1 + i1));  // 연산 시 큰 타입으로 자동 형 변환 후 연산
		System.out.println("c1 + i1 = " + (c1 + (char) i1));  // int 타입을 char 타입으로 강제 형 변환
		System.out.println();
		
		double d1 = 10.0;
		System.out.println("d1 + i1 = " + (d1 + i1));
		
		// 기본적으로 작은 크기의 타입과 큰 크기의 타입의 연산 결과는 큰 데이터 타입으로
		// 자동 형 변환된 후 연산된다. 따라서, 결과값을 저장하는 변수 타입은 큰 크기의 타입이 선언되어야 한다.
		
		double d2 = 10 + 10.0;  // 자동 형 변환
		int i2 = (int) (10 + 10.0);  // 강제 형 변환
		System.out.println("d2 = " + d2);
		System.out.println("i2 = " + i2);
		
		
	}

}





















