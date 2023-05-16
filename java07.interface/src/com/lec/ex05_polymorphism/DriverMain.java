package com.lec.ex05_polymorphism;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.drvie(new Bus());
		driver.drvie(new Taxi());
		driver.drvie(new MotorBike());
		driver.drvie(new BiCycle());
		driver.drvie(new KickBoard());
		

	}

}



class MotorBike implements Vehicle {

	@Override
	public void run() {
		System.out.println("오토바이를 운전합니다.");
		
	}
}

class BiCycle implements Vehicle {

	@Override
	public void run() {
		System.out.println("자전거를 운전합니다.");
		
	}
}

class KickBoard implements Vehicle {

	@Override
	public void run() {
		System.out.println("킥보드를 운전합니다.");
		
	}
}



