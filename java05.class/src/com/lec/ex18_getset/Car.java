package com.lec.ex18_getset;

public class Car {
	
	private int speed = 0;
	private boolean stop;
	
	public void setSpeed(int speed) {
		
		if(speed > 100) {
			System.out.println(speed + " (경고) 제한속도 초과");
			this.speed = 100;
		} else {
			if(speed < 30) {
				System.out.println(speed + " 속도를 올리세요.");
				this.speed = 30;
			} else {
			    this.speed = speed;
			}
		}
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}

	public void isStop() {
		
		if(this.speed < 30) {
			this.stop = true;
		} else {
			System.out.print("현재 속도 = " + this.speed + "km/h ");
			System.out.print("정지 불가.");
			System.out.println("속도를 줄이세요.");
		}
		
	}
	
	public void isStop(boolean stop) {
		this.stop = stop;
	}

	public int getSpeed() {
		return this.speed;
	}

	public boolean getStop() {
		return this.stop;
	}


}






