package com.lec.v4_interface_nosetter;

public class CheapRobot extends Robot {
	
	InterFly fly;
	InterMissile missile;
	InterSword sword;
	
	public CheapRobot(String name, int qty) {
		super(name, qty);
	}
	
	public CheapRobot(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		this(name, qty);
		this.fly = fly;
		this.missile = missile;
		this.sword = sword;
	}

	@Override
	public void actionFly() {
		fly.fly();
	}

	@Override
	public void actionMissile() {
		missile.missile();
	}

	@Override
	public void actionSword() {
		sword.sword();
	}


}
