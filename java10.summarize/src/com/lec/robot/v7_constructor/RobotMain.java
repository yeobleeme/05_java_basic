package com.lec.robot.v7_constructor;

import com.lec.robot.v4_인터페이스.*;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V7.0 (constructor) ===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new CheapRobot("Cheap", 5, new FlyNo(), new MissileNo(), new SwordNo());
		robot.makeRobot();
		
		robot = new StandardRobot("Standard", 10, new FlyYes(), new MissileNo(), new SwordWood());
		robot.makeRobot();
		
		robot = new SuperRobot("Super", 15, new FlyYes(), new MissileYes(), new SwordL());
		robot.makeRobot();

	}

	


}
