package com.lec.ex09_member;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();  // private: 외부 접근 불가
		Car car2 = new Car("S500");
		Car car3 = new Car(250);
		Car car4 = new Car("S500", 250);
		Car car5 = new Car(250, "S500");
		Car car6 = new Car("S500", "black", 500, 100);
		car6.company = "포르쉐";
		System.out.println(car6.toString());
	}

}
