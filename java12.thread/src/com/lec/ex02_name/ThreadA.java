package com.lec.ex02_name;

public class ThreadA extends Thread {
	
	public ThreadA() {
		super.setName("ThreadA");  // super 생략가능
	}
	
	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(super.getName() + " 가 출력한 내용");  // super 생략가능
		}
	}

}
