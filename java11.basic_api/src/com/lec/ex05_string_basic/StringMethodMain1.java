package com.lec.ex05_string_basic;

public class StringMethodMain1 {

	public static void main(String[] args) {
		
		// 1. replace
		String oldStr = "자바 프로그램";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);
		System.out.println(oldStr.hashCode() + " : " + newStr.hashCode());
		oldStr = oldStr.replace("자바", "Python");
		System.out.println(oldStr.hashCode() + " : " + oldStr);
		System.out.println();
		
		// 2. substring
		// a. substring(int from, int to) : from ~ to-1 까지의 문자열을 추출
		// b. substring(int from) : from ~ 문자열 끝까지 추출
		String ssn = "991118-1234567";
		String birthday = ssn.substring(0, 6);
		String sno = ssn.substring(7);
		String gender = ssn.substring(7,8);
		System.out.println("생년월일: " + birthday);
		System.out.println("주민번호뒷자리: " + birthday);
		System.out.println("성별: " + gender);
		System.out.println();
		
		// 3. toLowerCase, toUpperCase
		String str1 = "java programming";
		String str2 = "JAVA PROGRAMMING";
		System.out.println(str1.toUpperCase() + " : " + str1);
		str1 = str1.toUpperCase();
		System.out.println(str1.toUpperCase() + " : " + str1);
		System.out.println(str2.toLowerCase() + " : " + str2);
		str2 = str2.toUpperCase();
		System.out.println(str2.toLowerCase() + " : " + str2);
		System.out.println();
		
		// 대소문자 비교
		str1 = "java programming";
		str2 = "JAVA PROGRAMMING";
		System.out.println(str1.equals(str2));  // false
		System.out.println(str1.equalsIgnoreCase(str2));  // true
		System.out.println();
		
		// 4. trim : 앞뒤 공백 제거
		String tel1 = "     02";
		String tel2 = "1234     ";
		String tel3 = "  02 1234    ";
		System.out.println(tel1.trim());
		System.out.println(tel2.trim());
		System.out.println(tel3.trim());
		System.out.println(tel3);
		tel3 = tel3.trim();
		System.out.println(tel3);
		System.out.println();
		
		// 5. valueOf : int, double 등의 기본타입을 문자열로 변환
		String val1 = String.valueOf(false);
		String val2 = String.valueOf(10);
		String val3 = String.valueOf(3.14);
		System.out.println(val1);
		System.out.println("val2 + val3 = " + (val2 + val3));
		
		int val4 = Integer.parseInt("10");
		int val5 = Integer.valueOf("10");
		System.out.println("val4 + val5 = " + (val4 + val5));

	}

}














