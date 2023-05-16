package com.lec.ex05_accuracy;

public class FloatToDoubleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1 = 123456780;
		int i2 = 123456780;
		
		// 형 변환될 때 정밀도
		
		float f1 = i1;  // 정밀도 문제 발생
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("f1 = " + f1);
		System.out.println();
		
		i2 = (int) f1;  // 정밀도 문제 발생
		System.out.println("i2 = " + i2);
		
		int result = i1 - i2;
		System.out.println("정밀도 문제 발생 : " + result);
		
		// 실수(float)를 연산할 경우에는 정밀도 문제가 발생된다.
		// float 0.1을 정확히 표현할 수 없다. 그러무로 실수의 연산은
		// float가 아닌 double로 연산할 것을 권장한다
		System.out.println("double의 연산 : " + (1.0 - 0.1));
		System.out.println("double과 float의 연산 : " + (1.0 - 0.1f));  // 형 변환
		System.out.println("float와 float의 연산 : " + (1.0f - 0.1f));  // 형 변환
		
		
	}

}























