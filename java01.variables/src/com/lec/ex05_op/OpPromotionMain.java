package com.lec.ex05_op;

public class OpPromotionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연산 시 형 변환 발생
		byte b1 = 10; 
		byte b2 = 20;
		byte b3 = (byte) 30;
		
		// java에서는 정수형 연산의 기본은 int타입으로 연산된다.
		byte b4 = (byte) (b1 + b2);  
		// b1과 b2가 int로 자동 형 변환 후 더한 결과를 byte로 강제 형 변환 결과를 대입
		int i1 = b1 + b2;  // b1, b2를 int로 자동 형 변환 후 더한 결과를 대입
		
		char c1 = '가';
		char c2 = '1'; 
//		char c3 = c1 + c2;  // 에러 : 
		char c3 = (char) (c1 + c2);
		System.out.println("c3 = " + c3);
		
		int i2 = (char) (c1 + c2);
		System.out.println("i2 = " + i2);
		System.out.println("c2 = " + c2);
		

	}

}
