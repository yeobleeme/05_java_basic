package com.lec.ex01_class;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스 (필드, 생성자, 메서드로 구성_
		String str1 = new String();        // 기본 생성자
		String str2 = new String("소향");  // 매개변수가 있는 생성자
		System.out.println(str2.toString());
		
		Human kim = new Human();
		Human park = new Human("박씨");
		
		Human adam = new Human();
		
		System.out.println(adam);
		System.out.println(adam.toString());
		System.out.println();
		
		adam.name = "아담";
	    adam.gender = "남";
	    adam.age = 10000;
	    adam.ssn = "991118-12345678";
	    
		
		System.out.println(adam.name);
		System.out.println(adam.gender);
		System.out.println(adam.age);
		System.out.println(adam.ssn);
		System.out.println();
		
		Human eve = new Human("이브");
		eve.name = "이브";
		eve.gender = "여";
		eve.age = 9999;
		eve.ssn = "991228-2014567";
		
		System.out.println(eve.name);
		System.out.println(eve.gender);
		System.out.println(eve.age);
		System.out.println(eve.ssn);
		System.out.println();
		
		adam.think();
		adam.eat();
		adam.speak();
		adam.move();
		System.out.println();
		
		eve.think();
		eve.eat();
		eve.speak();
		eve.move();
		System.out.println();
		
	}

}











