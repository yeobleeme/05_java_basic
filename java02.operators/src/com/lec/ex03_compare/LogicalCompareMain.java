package com.lec.ex03_compare;

public class LogicalCompareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 논리 연산자 (&&, &, ||, |, ^, !)
		
		// 논리 연산자는 논리곱(&&, &), 논리합(||, |), 배타적 논리합(XOR, ^)
		// 논리부정(!) 연산을 수행한다. 논리 연산자의 피연산자는 boolean타입만 
		
		// 논리 연산자인 &&/||와 &/|는 산출 결과는 같지만 연산 과정이 조금 다르다.
		// &&/||는 앞의 피연산자가 false라면 뒤의 연산은 비교하지 않고, false를 리턴하지만 
		// &/|는 두 피연산자를 모두 비교해서 산출 결과를 리턴한다. (&/|보다 &&/||이 더 효율적으로 동작)
		
		int charCode = 'A';
		
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자");
		}
		
		if((charCode >= 48) && (charCode <= 57)) {
			System.out.println("숫자");
		}
		
		
		int value = 6;
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의 배수");
		}
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의 배수");
		}

	}

}

















