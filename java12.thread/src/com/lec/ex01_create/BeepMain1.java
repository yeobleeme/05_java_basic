package com.lec.ex01_create;

import java.awt.Toolkit;

public class BeepMain1 {

	public static void main(String[] args) throws InterruptedException {
		
		// 소리 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();  // 스피커 자원
		for(int i=0; i<5; i++) {
			toolkit.beep();
			Thread.sleep(500); // 0.5초간 정지
		}
		
		// 문자 출력
		for(int i=0; i<5; i++) {
			System.out.println("SOUND");
			Thread.sleep(500);
		}

	}

}
