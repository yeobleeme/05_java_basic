package com.lec.ex12_instance;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static(정적, 고정된) 
		Car car1 = new Car();
		String com = car1.company;
		System.out.println("회사이름 = " + com );
		System.out.println("모델이름 = " + car1.model);
		System.out.println("SPEED = " + car1.speed);
		System.out.println(car1.toString());
		Car.xxx();
		System.out.println();
		
		System.out.println("회사이름 = " + Car.company);
		Car.xxx();
		
		// 객체 멤버이기 때문에 클래스로 접근 불가
//		System.out.println("모델이름 = " + Car.model);
//		System.out.println("SPEED = " + Car.speed);

	}

}
