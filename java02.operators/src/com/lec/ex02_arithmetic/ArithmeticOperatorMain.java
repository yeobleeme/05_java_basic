package com.lec.ex02_arithmetic;

public class ArithmeticOperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
   산술 연산자 (+, -, *, /, %)
   
   산술 연산자는 사칙 연산과 나머지를 구하는 연산자(%)를 포함해서 총 5개의 연산자가 있다.
   이 연산자는 boolean타입을 제외한 모든 기본 타입에 사용할 수 있다.
   
   산술 연산자의 특징은 피연산들의 타입이 동일하지 않을 경우 피연산자들의 타입을 일치시킨 후
   연산을 수행한다. 타입을 일치시킬 경우에 아래와 같은 규칙을 가지고 수행한다.
   
   1. 피연산자들이 모두 정수타입이고 int타입보다 크기가 작을 경우 모두 int로 형 변환 후 연산을 수행.
      따라서 연산의 결과 또한 int타입이다.
      
      byte + byte -> int + int = int 
      
   2. 피연산자들이 모두 정수 타입이고 long타입이 있을 경우 모두 long으로 변환 후 연산을 수행.
      따라서 연산의 결과 또한 long타입이다.
      
      int + long -> long + long = long
      
   3. 피연산자 중 실수 타입(float, double)이 있을 경우 크기가 큰 실수 타입으로 변환 후 연산을 수행.
      따라서 연산의 결과는 실수타입이다.
      
      int + double -> double + double = double
      
      
   간단하게 정리하면 long을 제외한 정수 타입의 연산은 int타입으로 연산되고, 피연산자 중 하나라도
   실수타입이 있다면 결과는 실수 타입으로 연산된다.
   
   정수 타입 연산 결과가 int타입으로 나오는 이유는 
   JVM이 기본적으로 32bite(4byte) 단위로 연산을 수행하기 때문이다.
   
*/

		byte byte1 = 1;
		byte byte2 = 2;
//		byte byte3 = (byte1 + byte2);  // 형 변환을 하지 않을 경우 에러
		int result1 = byte1 + byte2;
		System.out.println("result1 = " + result1);
		
		int int1 = 10;
		int int2 = 4; 
		int result2 = int1 + int2;  // 정수 타입의 연산은 기본으로 int타입으로 수행된다.
		System.out.println("result2 = " + result2);
		
		double result3 = int1 / int2;
		System.out.println("result3 = " + result3);
		System.out.println();
		
		result3 = (int1 / 4.0); 
		System.out.println("result3 = " + result3);

		int v1 = 5;
		int v2 = 5;
		result1 = v1 + v2;
		System.out.println("result1 = " + result1);
		
		result1 = v1 - v2;
		System.out.println("result1 = " + result1);
		
		result1 = v1 * v2;
		System.out.println("result1 = " + result1);
		
		result1 = v1 / v2;
		System.out.println("result1 = " + result1);
		
		result1 = v1 % v2;
		System.out.println("result1 = " + result1);
		
		
	}

}















