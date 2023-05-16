package com.lec.robot.v8_final;

import com.lec.robot.v4_인터페이스.*;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V8.0 (final) ===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new Robot("Cheap", 5, new FlyNo(), new MissileNo(), new SwordNo());
		robot.makeRobot();
		robot = new Robot("Standard", 10, new FlyYes(), new MissileNo(), new SwordWood());
		robot.makeRobot();
		robot = new Robot("Super", 15, new FlyYes(), new MissileYes(), new SwordL());
		robot.makeRobot();
		
//		robot = new Robot();
//		robot.makeRobot(new FlyNo(), new MissileNo(), new SwordNo());
		
		// 실습
		// 1. v4.0 에서 setter 없애는 로직
		// 2. v8.0 에서 method 다형성(makeRobot(InterFly, InterMissile, InterSword))

	}

}
