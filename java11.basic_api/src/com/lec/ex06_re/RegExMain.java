package com.lec.ex06_re;

import java.util.regex.Pattern;

/*
    정규표현식과 Pattern 클래스(java.util.regex.Pattern)
    
    문자열에 정해진 형식: 정규식, Regular Expression 으로 구성되어 있는지
    여부를 검증할 때 사용한다. (정규식을 작성하는 방법은 API - java.util.regex.Pattern 클래스 참조
    
    간단히 말해서 정규식은 문자 or 숫자 등 반복기 효과가 결합된 문자열이다. 
    예) 문자열이 02-1234-1234 또는 010-1234-1234와 같이 전화번호를 포함하는지 여부를 확인할 수 있는데
    정규식으로 표현하면 "(02|010)-\d{3,4}-\d{4}" 의 형태인지 여부를 boolean으로 리턴, 
    이메일의 경우 "hong@gmail.com" 의 패턴은 "\w+@\w\.\w(\.\w+)?" 의 형태로 검증할 수 있다.
*/

public class RegExMain {

	public static void main(String[] args) {
		
		// 1. 전화번호의 유효성 검증
		String tel1 = "02-123-45678";
		String tel2 = "010-9999-8888";
		
		// 검증
		// 지역번호가 2-3자리인지, 숫자인지를 비교
		// 전화번호구분자가 "-"인지 확인
		// 국번 숫자인지 3-4자리인지를 비교
		// 뒤4자리가 숫자인지, 4자리인지를 비교
		
		// 정규식 패턴
		String re = "(02|010|031|051)-\\d{3,4}-\\d{4}";
		boolean result = Pattern.matches(re, tel1);
		System.out.println(result);
		
		System.out.println(Pattern.matches(re, "031-123-4567"));
		System.out.println(Pattern.matches(re, "010-12332-4567"));
		
		if(Pattern.matches(re, "031-123-1234")) {
			System.out.println("문제없음");
		} else {
			System.out.println("문제있음");
		}
		System.out.println();
		
		// 2. 이메일 유효성 검증
		String email = "admin@gmail.com";
		re = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		if(Pattern.matches(re, email)) {
			System.out.println("문제없음");
	    } else {
	     	System.out.println("문제있음");
	    }
    	System.out.println();
    	
    	
    	// 3. 문자 검증
    	System.out.println(Pattern.matches("[a-z]", "a"));  // true
    	System.out.println(Pattern.matches("[A-Z]", "A"));  // true
    	System.out.println(Pattern.matches("[a-z]", "az"));  // false 개별단위
    	System.out.println(Pattern.matches("[a-z]+", "az"));  // true 단어단위+
    	System.out.println(Pattern.matches("[A-Z]+", "AC"));  // true 단어단위+
    	System.out.println(Pattern.matches("[A-Z]+", "aC"));  // false
    	System.out.println(Pattern.matches("[a-zA-Z]+", "aC"));  // true
    	System.out.println();
    	
    	// 4. 숫자
    	System.out.println(Pattern.matches("[0-9]", "0"));  // true
    	System.out.println(Pattern.matches("[0-9]", "01"));  // false
    	System.out.println(Pattern.matches("[0-9]+", "01"));  // true
    	System.out.println();
    	
        // 영문=소문자,대문자 / 숫자 / _
    	System.out.println(Pattern.matches("[0-9a-zA-Z]+", "10asD"));  // true
    	System.out.println(Pattern.matches("[0-9a-zA-Z]+", "01012345678"));  // true
    	System.out.println(Pattern.matches("\\w+", "01sfd1"));  // true
    	System.out.println(Pattern.matches("[0-9a-zA-Z]+", "0101234_5678"));  // false
    	System.out.println(Pattern.matches("\\w+", "0101234_5678"));  // true
    	System.out.println();
    	
    	// 5. not(^) 영문=소문자,대문자 / 숫자 / _
    	System.out.println(Pattern.matches("\\w+", "0101234_5678"));  // true
    	System.out.println(Pattern.matches("\\W+", "0101234_5678"));  // false
    	System.out.println(Pattern.matches("\\W+", "0101234_5678"));  // false
    	System.out.println(Pattern.matches("[0-9a-zA-Z_]+", "0101234_5678"));  // true
    	System.out.println(Pattern.matches("[^0-9a-zA-Z_]+", "0101234_5678"));  // false
    	
	}

}










