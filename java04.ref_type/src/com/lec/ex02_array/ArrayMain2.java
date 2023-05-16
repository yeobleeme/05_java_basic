package com.lec.ex02_array;

public class ArrayMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. new 연산자 - 배열 선언 및 초기화
		int scores[];  // 배열 선언 - 크기, 값 등은 선언되지 않음.
		scores = new int[] {90, 95, 88, 90, 89, 100, 99, 78, 66, 65, 88, 99};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("배열 요소의 합계 = " + sum + "\n");
		System.out.println("배열 요소의 평균 = " + (sum / scores.length) + "\n");
		
		
		// 3. 메서드를 이용한 배열 처리
		int tot = total(scores);
		System.out.println("배열 요소의 합계 = " + tot + "\n");
		System.out.println("배열 요소의 평균 = " + (tot / scores.length) + "\n");

	}

	
	private static int total(int[] scores) {
		// TODO Auto-generated method stub
		int tot = 0;
		for(int score : scores) {
			tot += score;
		}
		return tot;
		
	}
  
}











