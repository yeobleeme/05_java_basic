package com.lec.ex04_class;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메서드 오버라이딩(2)
		Adam adam = new Adam();
		
		System.out.print(adam.name +", "+ adam.gender +", "+ adam.age);
		System.out.println();
		
		adam.speak();
		
		String msg = adam.move();
		System.out.println(msg);
		
		System.out.println(adam.toString());
	    System.out.println();
	    
	    
	    Eve eve = new Eve();
	    
	    System.out.print(eve.name +", "+ eve.gender +", "+ eve.age);
		System.out.println();
		
		eve.speak();
		
		msg = eve.move();
		System.out.println(msg);
		
		System.out.println(eve.xxString());
		System.out.println(eve.toString());		
	    System.out.println();
	    
		
	}

}










