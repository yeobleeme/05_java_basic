package com.lec.robot.v5_extends;

import com.lec.robot.v4_인터페이스.*;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V5.0 (인터페이스, extends ) ===");
		System.out.println();
	
	    Robot robot = null;
	    
	    robot = new CheapRobot("Cheap", 5);
	    System.out.println(robot.getClass());
	    robot.shape();
	    robot.actionWalk();
	    robot.actionRun();
	    robot.setFly(new FlyNo());
	    robot.actionFly();
	    robot.setMissile(new MissileNo());
	    robot.actionMissile();
	    robot.setSword(new SwordNo());
	    robot.actionSword();
	    System.out.println(robot.name + " stock = " + robot.qty);
	    System.out.println();
	    
	    robot = new StandardRobot("Standard", 5);
	    System.out.println(robot.getClass());
	    robot.shape();
	    robot.actionWalk();
	    robot.actionRun();
	    robot.setFly(new FlyYes());
	    robot.actionFly();
	    robot.setMissile(new MissileNo());
	    robot.actionMissile();
	    robot.setSword(new SwordWood());
	    robot.actionSword();
	    System.out.println(robot.name + " stock = " + robot.qty);
	    System.out.println();
	    
	    robot = new SuperRobot("Super", 5);
	    System.out.println(robot.getClass());
	    robot.shape();
	    robot.actionWalk();
	    robot.actionRun();
	    robot.setFly(new FlyYes());
	    robot.actionFly();
	    robot.setMissile(new MissileYes());
	    robot.actionMissile();
	    robot.setSword(new SwordL());
	    robot.actionSword();
	    System.out.println(robot.name + " stock = " + robot.qty);
	    System.out.println();
	
	

    }
	
}