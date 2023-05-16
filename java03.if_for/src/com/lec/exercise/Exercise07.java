package com.lec.exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 7. Exercise07.java : 
//		 while문과 Scanner를 이용해서 키보드로 부터 입력된 데이터로 예금, 출금, 조회, 종료기능을
//		 제공하는 코드를 작성(예금잔액을 입출금내역을 출력)
//		 WhileKeyControlMain.java를 참조해서 자유롭게 작성
//						System.out.println("-------------------------------------");
//						System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
//						System.out.println("-------------------------------------");
           Scanner scanner = new Scanner(System.in);
			
			int selectNo = 1;
			int money = 0;
			int balance = 0;
			
			while(true) {
				System.out.println("-------------------------------------------");
				System.out.println("1. 예금  |  2. 출금  |  3. 조회  |  4. 종료");
				System.out.println("-------------------------------------------");
				System.out.print("선택 => ");
			
				selectNo = scanner.nextInt();
				
				if(selectNo==1) {
					System.out.print("예금액 => ");
					money = scanner.nextInt();
					balance += money;
					
				}else if(selectNo==2) {
					System.out.print("출금액 => ");
					money = scanner.nextInt();
					balance -= money;
					
				}else if(selectNo==3) {
					System.out.println("잔액 => " + balance);
				
				}else if(selectNo==4) {
					System.out.println("종료");
					break;
					
				}else {
					System.out.println("올바른 선택이 아닙니다.");
				}							
			}

	}

}
