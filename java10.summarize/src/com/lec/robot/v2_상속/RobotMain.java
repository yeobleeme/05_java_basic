package com.lec.robot.v2_상속;

public class RobotMain {

	public static void main(String[] args) {

		CheapRobot cheaprobot = new CheapRobot("CheapRobot", 10);
		cheaprobot.shape();
		cheaprobot.actionWalk();
		cheaprobot.actionRun();
		cheaprobot.actionFly();
		cheaprobot.actionMissile();
		cheaprobot.actionSword();
		System.out.println(cheaprobot.name + " stock = " + cheaprobot.qty);
		System.out.println();
		
		StandardRobot standardrobot = new StandardRobot("StandardRobot", 20);
		standardrobot.shape();
		standardrobot.actionWalk();
		standardrobot.actionRun();
		standardrobot.actionFly();
		standardrobot.actionMissile();
		standardrobot.actionSword();
		System.out.println(standardrobot.name + " stock = " + standardrobot.qty);
		System.out.println();
		
		SuperRobot superrobot = new SuperRobot("SuperRobot", 15);
		superrobot.shape();
		superrobot.actionWalk();
		superrobot.actionRun();
		superrobot.actionFly();
		superrobot.actionMissile();
		superrobot.actionSword();
		System.out.println(superrobot.name + " stock = " + superrobot.qty);
		
	}

}