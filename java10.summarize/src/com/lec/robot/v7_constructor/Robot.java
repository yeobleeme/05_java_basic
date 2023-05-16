package com.lec.robot.v7_constructor;

import com.lec.robot.v4_인터페이스.*;

public class Robot {
	
	InterFly fly;
	InterMissile missile;
	InterSword sword;
	
	public String name;
	public int qty;
	
	public Robot(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		this.name = name;
		this.qty = qty;
		this.fly = fly;
		this.missile = missile;
		this.sword = sword;
	}

	
	public void shape() { System.out.println(this.name + ". 팔, 다리, 머리, 몸통"); }
	public void actionWalk() { System.out.println("걸을 수 있습니다."); }
	public void actionRun() { System.out.println("달릴 수 있습니다."); }
	
//	public void setFly(InterFly fly) {
//		this.fly = fly;
//	}
//	
//	public void setMissile(InterMissile missile) {
//		this.missile = missile;
//	}
//	
//	public void setSword(InterSword sword) {
//		this.sword = sword;
//	}
	
	public void actionFly() {
		fly.fly();
	}

	public void actionMissile() {
		missile.missile();
	}

	public void actionSword() {
		sword.sword();
	}
	
	
	public void makeRobot() {
		shape();
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
		System.out.println(this.toString() + "\n");
	}
	
	
	@Override
	public String toString() {
		return this.name + " stock = " + this.qty;
	}

}








