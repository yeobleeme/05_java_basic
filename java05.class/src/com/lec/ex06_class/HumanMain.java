package com.lec.ex06_class;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 상속(2)
		Adam adam = new Adam();
		adam.name = "아담";
		System.out.println(adam.gender);
		adam.move();
		System.out.println(adam.toString());
		System.out.println();
		
		Eve eve = new Eve();
		eve.name = "이브";
		eve.move();
		eve.speak();
		System.out.println(eve.toString());
		System.out.println();
		
		Korean korean = new Korean();
		korean.name = "홍길동";
		korean.nation = "대한민국";
		korean.age = 900;
		System.out.println(korean.nation);
		System.out.println(korean.name);
		System.out.println(korean.age);
		korean.speak();
		korean.move();
		System.out.println(korean.toString());
		System.out.println();
		
		American american = new American();
		american.name = "Steve";
		american.age = 30;
		System.out.println(american.nation);
		System.out.println(american.name);
		System.out.println(american.age);
		american.speak();
		american.move();
		System.out.println(american.toString());
		System.out.println();
		
		American american2 = new American();
		american2.name = "에스더";
		american2.gender = "여자";
		american2.nation = "미국";
		System.out.println(american2.gender);
		System.out.println(american2.nation);
		System.out.println(american2.name);
		

	}

}












