package com.lec.ex04_while;

public class WhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i<=10) {
			System.out.print(i + ", ");
			i++;
		}
		System.out.println();
		
		// 1~100 까지 합
		int sum = 0;
        i = 1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
