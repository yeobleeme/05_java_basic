package com.lec.ex05_break;

public class BreakOuterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + " = " + lower);
				if(lower=='d') break Outter;
			}
			System.out.println("바깥 for문...");
		}

	}

}
