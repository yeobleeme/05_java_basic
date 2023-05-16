package com.lec.v8_method_polymorphism;

import com.lec.robot.v4_인터페이스.*;

public class Robot {
	
	public String name;
	public int qty;
	
	InterFly fly;
	InterMissile missile;
	InterSword sword;
	
	public Robot(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	public Robot(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		this(name, qty);
		
		this.fly = fly;
		this.missile = missile;
		this.sword = sword;
	}
	
	@Override
	public String toString() {
		return "Robot [name=" + name + ", qty=" + qty + "]";
	}
	
	public void shape() {
		System.out.println("Robot."+name);
	}
	public void actionWalk() {
		System.out.println("걷기");
	}
	public void actionRun() {
		System.out.println("달리기");
	}

	
	
	public void actionFly(){
		fly.fly();
	}
	public void actionMissile(){
		missile.missile();
	}
	public void actionSword(){
		sword.sword();
	}
	
	public void makeRobot() {
		System.out.println(this);
		shape();
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
	}
	
	public void makeRobot(InterFly fly, InterMissile missile, InterSword sword) {
		this.fly = fly;
		this.missile = missile;
		this.sword = sword;
		
		this.makeRobot();
		
	}
	
}