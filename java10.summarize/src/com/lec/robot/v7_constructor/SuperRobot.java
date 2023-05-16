package com.lec.robot.v7_constructor;

import com.lec.robot.v4_인터페이스.*;

public class SuperRobot extends Robot {

	public SuperRobot(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		super(name, qty, fly, missile, sword);
	}

}
