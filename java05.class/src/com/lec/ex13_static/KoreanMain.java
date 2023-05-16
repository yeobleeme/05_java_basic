package com.lec.ex13_static;

public class KoreanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korean kim = new Korean("김갑순", "920101-2390045");
		System.out.println(kim);
		System.out.println();
		
		kim.nation = "미국";
		System.out.println(kim);
		System.out.println();
		
		Korean hong = new Korean("홍길동", "901103-1234567");
		System.out.println(hong);
		System.out.println();
		
		Korean park = new Korean("박길동", "901103-1234567");
		Korean son = new Korean("손길동", "901103-1234567");
		System.out.println(park);
		System.out.println(son);
		System.out.println();
		
		Korean.nation = "중국";
		Korean jung = new Korean("정길동", "901103-1234567");
		System.out.println(jung);
		

	}

}
