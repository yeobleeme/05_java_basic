package com.lec.ex03_compare;

public class ConditionalCompareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 삼항 연산자 (조건식 ? true일 경우 : false일 경우)는 세 개의 피연산자를 필요로 하는
		// 연산자를 말한다. 삼항 연산자는 ? 앞의 조건식에 따라 콜론(:) 앞뒤의 피연산자가
		// 선택된다고 해서 조건 연산식이라 하기도 한다.
		// 조건식 ? 값 or 표현식 : 값 or 표현식
		
		int score = 85;
		if(score>=90) {
			System.out.println("A grade");
		} else {
			System.out.println("B grade");
		}
		
		// 삼항 연산식
		char grade = (score>=90) ? 'A' : 'B';
		System.out.println(grade + " grade");
		

	}

}















