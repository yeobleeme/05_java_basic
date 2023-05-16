package com.lec.v4_interface_nosetter;

public class RobotMain {

	public static void main(String[] args) {

		CheapRobot robot_c = new CheapRobot("CheapRobot", 10, new FlyNo(), new MissileNo(), new SwordNo());
		robot_c.shape();
		robot_c.actionWalk();
		robot_c.actionRun();
		robot_c.actionFly();
		robot_c.actionMissile();
		robot_c.actionSword();
		System.out.println(robot_c.name + " stock = " + robot_c.qty);
		System.out.println();
		
		StandardRobot robot_sd = new StandardRobot("StandardRobot", 10, new FlyYes(), new MissileNo(), new SwordWood());
		robot_sd.shape();
		robot_sd.actionWalk();
		robot_sd.actionRun();
		robot_sd.actionFly();
		robot_sd.actionMissile();
		robot_sd.actionSword();
		System.out.println(robot_sd.name + " stock = " + robot_sd.qty);
		System.out.println();
		
		SuperRobot robot_sp = new SuperRobot("SuperRobot", 10, new FlyYes(), new MissileYes(), new SwordL());
		robot_sp.shape();
		robot_sp.actionWalk();
		robot_sp.actionRun();
		robot_sp.actionFly();
		robot_sp.actionMissile();
		robot_sp.actionSword();
		System.out.println(robot_sp.name + " stock = " + robot_sp.qty);
		System.out.println();
		
		
	}

}
