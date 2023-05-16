package com.lec.robot.v4_인터페이스;

//import com.lec.robot.v4_인터페이스.InterFly;
//import com.lec.robot.v4_인터페이스.InterMissile;
//import com.lec.robot.v4_인터페이스.InterSword;

public class RobotMain {

	public static void main(String[] args) {

		System.out.println("=== Robot V4.0 (인터페이스) ===");
		System.out.println();

		CheapRobot cheapRobot = new CheapRobot("CheapRobot", 10);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.setFly(new FlyNo());
		cheapRobot.actionFly();
		cheapRobot.setMissile(new MissileNo());
		cheapRobot.actionMissile();
		cheapRobot.setSword(new SwordNo());
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name + " stock = " + cheapRobot.qty);
		System.out.println();
		
		StandardRobot standardRobot = new StandardRobot("StandardRobot", 10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.setFly(new FlyYes());
		standardRobot.actionFly();
		standardRobot.setMissile(new MissileNo());
		standardRobot.actionMissile();
		standardRobot.setSword(new SwordWood());
		standardRobot.actionSword();
		System.out.println(standardRobot.name + " stock = " + standardRobot.qty);
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot("SuperRobot", 10);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		superRobot.setMissile(new MissileYes());
		superRobot.actionMissile();
		superRobot.setSword(new SwordL());
		superRobot.actionSword();
		System.out.println(superRobot.name + " stock = " + superRobot.qty);
		System.out.println();
		
		
	}

}
