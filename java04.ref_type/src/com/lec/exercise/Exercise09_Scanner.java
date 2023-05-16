package com.lec.exercise;

import java.util.Scanner;

public class Exercise09_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 8. Exercise09.java : 	
//	    키보드로부터 학생 수와 각 학생들의 점수를 입력받아서 최고 점수 및 평균 점수를 구하기
//	    (참고: Scanner의 nextlnt() 메소드이용)
//
//		System.out.println("---------------------------------------------");
//		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//		System.out.println("---------------------------------------------");
//		System.out.print("선택> ");	
//		
//		JOptionPan.showInputDialog() 이용해도 상관없음
	
	boolean run = true;
	   int num = 0;
	   int score[] = {};
	   Scanner s = new Scanner(System.in);

	   while(run) {
		    System.out.println("----------------------------------------------------------");
			System.out.println("1.학생수입력 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택 => ");	
			int selectNo = s.nextInt();
			
			switch (selectNo) {
			
			case 1: 
			    System.out.println("학생수 => ");
		     	num = s.nextInt();
			    score = new int[num];
		    	break;
			
			case 2: 
				for(int i=0; i<score.length; i++) {
					System.out.println("학생 " + (i+1) + " 점수입력 => ");
					score[i] = s.nextInt();
				}
				break;
			
			case 3: 
				for(int i=0; i<score.length; i++) {
					System.out.println("학생" + (i+1) + " 점수 = " + score[i]);
				}
				break;
				
			case 4: 
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i=0; i<score.length; i++) {
					max = (max<score[i]) ? score[i] : max;
					sum += score[i];
				}
				avg = (double)(sum/num);
				System.out.println("최고 점수 = " + max);
				System.out.println("평균 점수 = " + avg);
				break;
				
			default : 
				run = false;
				
			}
		   
	   }
	   System.out.println("종료");

	}

}











