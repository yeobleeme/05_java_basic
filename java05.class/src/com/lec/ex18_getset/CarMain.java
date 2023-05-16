package com.lec.ex18_getset;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		// car 객체의 필드(속성) -> 캡슐화(은닉화, private)
//		car.speed = 10000;
//		car.stop =true;
		
		car.setSpeed(10000);
		System.out.println(car);
		
		car.setSpeed(20);
		System.out.println(car);
		
		car.isStop();
		
		car.setSpeed(10);
		car.isStop();
		
		System.out.println();
		
		// car 객체의 속성 은닉화 -> 접근 불가.
//		System.out.println(car.speed);
		int speed = car.getSpeed();
		car.setSpeed(90);
		System.out.println("현재 운행 속도 = " + speed + " km/h");
		
		car.isStop(true);
		if(!car.getStop()) {
			System.out.println("현재 " + speed + " km/h 속도로 운행중");
		} else {
			System.out.println("현재 운행 정지");
		}

	}

}







