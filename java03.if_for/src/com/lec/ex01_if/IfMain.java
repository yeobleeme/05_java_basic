package com.lec.ex01_if;

public class IfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 89;
		
		// 1. 단순 if
		if(score>=90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("A학점 입니다.");
		}
		
		// 2. if~else
		if(score<90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("A학점 아닙니다.");
		} else {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("A학점 입니다.");
		}
		
		// 3. if~else if~else
		// 점수에 따라 A~F학점 출력하기
		if(score>=90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("A학점 입니다.");
		} else if(score>=80){
			System.out.println("점수가 80보다 크거나 같습니다.");
			System.out.println("B학점 입니다.");
		} else if(score>=70){
			System.out.println("점수가 70보다 크거나 같습니다.");
			System.out.println("C학점 입니다.");
		} else if(score>=60){
			System.out.println("점수가 60보다 크거나 같습니다.");
			System.out.println("D학점 입니다.");
		} else if(score<60){
			System.out.println("점수가 60보다 작습니다.");
			System.out.println("F학점 입니다.");
		}
		

	}

}

















