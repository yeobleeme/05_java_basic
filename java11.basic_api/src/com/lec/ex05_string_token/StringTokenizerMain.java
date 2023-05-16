package com.lec.ex05_string_token;

import java.util.StringTokenizer;

/*
    StringTokenizer 클래스
    
    문자열이 특정 구분자(delimiter)로 연결이 되어 있는 경우 구분자를 기준으로 문자열을
    분리하기 위해서 String.split(regex)을 이용하거나 java.lang.StringTokenizer 클래스를 이용.
    
    String.split(regex)은 정규표현식으로 분리하지만 StringTokenizer()는 문자(구분자)로
    구분한다. 문자열이 한 종류의 구분자로 연결되어 있을 경우에는 StringTokenizer를 
    이용하면 간단하게 문자열(token)을 분리할 수 있다.
    
    StringTokenizer의 메서드
    
    1. countToken() : 현재 남아있는 token의 갯수를 int로 리턴
    2. hasMoreToken() : 남아있는 token이 있는지 여부를 boolean으로 리턴
    3. nextToken() : token을 하나씩 꺼내오는 메서드로 String으로 리턴
       ... nextToken()메서드는 더 이상 꺼내올 token이 없을 경우 
           NoSuchElementException 예외 발생하기 때문에 예외처리를 해야 한다.
*/

public class StringTokenizerMain {

	public static void main(String[] args) {
		
		String text = "홍길동/홍길자/홍길순/홍길상/홍길성";
		StringTokenizer st = new StringTokenizer(text, "/");  // 구분자를 정의하지 않으면 디폴트값: " ":공란
		int count = st.countTokens();
		System.out.println("현재 남아있는 token의 갯수 = " + count);
		System.out.println("남아있는 token의 여부 = " + st.hasMoreTokens());
		System.out.println();
		
		String str = st.nextToken();
		System.out.println("꺼내온 token = " + str);
		System.out.println("현재 남아있는 token의 갯수 = " + st.countTokens());
		System.out.println("남아있는 token의 여부 = " + st.hasMoreTokens());
		System.out.println();
		
		str = st.nextToken();
		System.out.println("꺼내온 token = " + str);
		System.out.println("현재 남아있는 token의 갯수 = " + st.countTokens());
		System.out.println("남아있는 token의 여부 = " + st.hasMoreTokens());
		System.out.println();
		
		// 1. for
		st = new StringTokenizer(text ,"/");
		count = st.countTokens();
		System.out.println("현재 남아있는 token의 갯수 = " + count);
		for(int i=0; i<count; i++) {
			String token = st.nextToken();
			System.out.print(token + " ");
		}
		System.out.println();
		System.out.println();
		
		// 2. while
		st = new StringTokenizer(text ,"/");
		count = st.countTokens();
		System.out.println("현재 남아있는 token의 갯수 = " + count);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token + " ");
		}
		System.out.println();
		System.out.println("현재 남아있는 token의 갯수 = " + st.countTokens());
		System.out.println("남아있는 token의 여부 = " + st.hasMoreTokens());

	}

}











