package com.lec.ex07_instanceof;

public class Driver {
	
	void drive(Vehicle vehicle) {
//		vehicle.run();
//		vehicle.checkFare();
		System.out.println(vehicle.getClass());
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		} else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.run();
			taxi.checkNight();
		} else {
			vehicle.run();
		}
		System.out.println();
	}

}


//class 오토바이 implements Vechile {
//
//	@Override
//	public void run() {
//		System.out.println("오토바이를 탑니다!");
//	}
//}
//class 자전거 implements Vechile {
//
//	@Override
//	public void run() {
//		System.out.println("자전거를 탑니다!");
//	}
//}