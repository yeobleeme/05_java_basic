package com.lec.robot.v6_method;

import com.lec.robot.v4_인터페이스.*;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V6.0 (common method) ===");
		System.out.println();
		
		Robot robot = null;
		
//		robot = new Robot("Cheap", 5);
		
		makeRobot(new Robot("Cheap", 5), new FlyNo(), new MissileNo(), new SwordNo());
		makeRobot(new Robot("Standard", 10), new FlyYes(), new MissileNo(), new SwordWood());
		makeRobot(new Robot("Super", 15), new FlyYes(), new MissileYes(), new SwordL());
//		
//		makeRobot();

	}

	private static void makeRobot(Robot robot, InterFly fly, InterMissile missile, InterSword sword) {
		
		System.out.println(robot.getClass());
	    robot.shape();
	    robot.actionWalk();
	    robot.actionRun();
	    robot.setFly(fly);
	    robot.actionFly();
	    robot.setMissile(missile);
	    robot.actionMissile();
	    robot.setSword(sword);
	    robot.actionSword();
	    System.out.println(robot.name + " stock = " + robot.qty);
	    System.out.println();
		
	}

}
