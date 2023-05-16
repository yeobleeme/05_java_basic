package com.lec.ex03_method_overriding;

public class SuperSonicAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	int flymode = NORMAL;
	
	@Override
	void fly() {
		if(flymode == NORMAL) {
			super.fly();
		} else {
			System.out.println("비행-초음속");			
		}
	}

}
