package com.lec.ex03_for;

public class ForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// i = 지역 변수. for문 블럭 안에서만 사용
		for(int i=0; i<=10; i++) {
			System.out.println(i + ", ");
		}
		System.out.println();
		
		// 1~100까지 합
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
