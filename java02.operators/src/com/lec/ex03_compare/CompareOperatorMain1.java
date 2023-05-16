package com.lec.ex03_compare;

public class CompareOperatorMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 비교 연산자 : <, >, <=, >=, !=
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = num1 == num2;
		boolean result2 = num1 != num2;
		boolean result3 = num1 <= num2;
		
		System.out.println("num1 == num2 = " + result1);
		System.out.println("num1 != num2 = " + result2);
		System.out.println("num1 <= num2 = " + result3);
		
		char char1 = 'A';  // 65
		char char2 = 'B';  // 66
		boolean result4 = char1 < char2;
		System.out.println("char1 < char2 = " + result4);
		
		System.out.println();
		
		// 비교 연산시에도 연산을 수행하기 전 형 변환이 발생되어 
		// 피연산자의 데이터 타입을 일치시킨다. 
		System.out.println('A' == 65);  // true
		System.out.println(3 == 3.0);  // true
		System.out.println(0.1 == 0.1f);  // false
		// 이진 포맷 기수를 사용하는 모든 부동 소수점 타입은 0.1을 정확히 표한할 수 없다.
		// 0.1f를 double로 형 변환을 하면 실제값은 0.10000000149011612이 된다.
		System.out.println();
		
		System.out.println(0.1f);
		System.out.println((double)0.1f);

	}

}














