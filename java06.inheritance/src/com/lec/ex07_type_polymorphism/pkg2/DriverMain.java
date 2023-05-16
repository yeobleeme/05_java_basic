package com.lec.ex07_type_polymorphism.pkg2;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver hong = new Driver();
		hong.drive(new Vehicle());
		hong.drive(new Bus());
		hong.drive(new Taxi());
		hong.drive(new BiCycle());
		hong.drive(new MotorBike());
		hong.drive(new AirPlane());

		
	}

}


class BiCycle extends Vehicle {
	
	@Override
	void run() {
		System.out.println("자전거를 탑니다.");
	}
}


class MotorBike extends Vehicle {
	
	@Override
	void run() {
		System.out.println("오토바이를 탑니다.");
	}
}


class AirPlane extends Vehicle {
	
	@Override
	void run() {
		System.out.println("비행기를 탑니다.");
	}
}
