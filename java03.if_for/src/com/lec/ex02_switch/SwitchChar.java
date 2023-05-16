package com.lec.ex02_switch;

public class SwitchChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'a';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("A학점 입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("B학점 입니다.");
			break;
		case 'C':
		case 'c':
			System.out.println("C학점 입니다.");
			break;
		case 'D':
		case 'd':
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
			
		}

	}

}
