package com.lec.ex11_method.declare;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calculator 객체를 생성하고 add~div 구현
		
		Scanner s = new Scanner(System.in);
		
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		System.out.println("두 숫자를 입력하세요.");
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		
		int result1 = cal.add(a, b);
		int result2 = cal.sub(a, b);
		int result3 = cal.mul(a, b);
		double result4 = cal.div(a, b);
		
		System.out.println("add = " + result1);
		System.out.println("sub = " + result2);
		System.out.println("mul = " + result3);
		System.out.println("div = " + result4);
		
		cal.powerOff();
		System.out.println();
		
		String result5 = cal.xxx(true);
		System.out.println("xxx = " + result5);

		String result6 = cal.yyy();
		System.out.println("yyy = " + result6);
		System.out.println();
		
		Calculator result7 = cal.zzz();
		System.out.println(result7.add(13123, 44421));

	}

}
