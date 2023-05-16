package com.lec.robot.v1_기본;

public class RobotMain {

	public static void main(String[] args) {

		CheapRobot cheaprobot = new CheapRobot(10);
		cheaprobot.shape();
		cheaprobot.actionWalk();
		cheaprobot.actionRun();
		cheaprobot.actionMissile();
		cheaprobot.actionSword();
		System.out.println("CheapRobot stock = " + cheaprobot.qty);
		System.out.println();
		
		StandardRobot standardrobot = new StandardRobot(10);
		standardrobot.shape();
		standardrobot.actionWalk();
		standardrobot.actionRun();
		standardrobot.actionMissile();
		standardrobot.actionSword();
		System.out.println("StandardRobot stock = " + standardrobot.qty);
		System.out.println();
		
		SuperRobot superrobot = new SuperRobot(10);
		superrobot.shape();
		superrobot.actionWalk();
		superrobot.actionRun();
		superrobot.actionMissile();
		superrobot.actionSword();
		System.out.println("SuperRobot stock = " + superrobot.qty);
		
	}

}
