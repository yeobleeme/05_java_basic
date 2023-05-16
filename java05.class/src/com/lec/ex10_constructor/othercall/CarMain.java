package com.lec.ex10_constructor.othercall;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		this(시그니처..) - 생성자 호출 방법
		Car car1 = new Car();
		Car car2 = new Car("911카레라");
		Car car3 = new Car("911카레라", "핑크");
		Car car4 = new Car("911카레라", "블루", 500);
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		System.out.println(car4.toString());

	}

}
