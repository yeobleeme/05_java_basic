package com.lec.v8_method_polymorphism;

import com.lec.robot.v4_인터페이스.*;

public class RobotMain {

	public static void main(String[] args) {
		
    new Robot("Cheap", 10, new FlyNo(), new MissileNo(), new SwordNo()).makeRobot();
	new Robot("Standard", 10, new FlyNo(), new MissileNo(), new SwordWood()).makeRobot();
	new Robot("Super", 10, new FlyYes(), new MissileYes(), new SwordWood()).makeRobot();
	new Robot("normal", 2).makeRobot(new FlyYes(), new MissileNo(), new SwordWood());
		
	}

}
