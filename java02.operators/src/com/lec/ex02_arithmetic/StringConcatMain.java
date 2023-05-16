package com.lec.ex02_arithmetic;

public class StringConcatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 연결 연산자 (+)
		// + = 산술 연산자, 부호 연산자, 문자열 연결 연산자
		String str1 = "JDK" + 1.8;
		System.out.println(str1);
		
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 1.8 + 0.2;
		System.out.println(str3);
		
		String str4 = 1.8 + 0.2 + "JDK";
		System.out.println(str4);

	}

}





















