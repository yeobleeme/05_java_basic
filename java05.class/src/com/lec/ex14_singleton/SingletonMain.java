package com.lec.ex14_singleton;

import java.util.Calendar;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1 = Singleton.getInstace();
		Singleton s2 = Singleton.getInstace();
		Singleton s3 = Singleton.getInstace();
		Singleton s4 = Singleton.getInstace();
		Singleton s5 = Singleton.getInstace();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		System.out.println();
		
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal1.hashCode());
		System.out.println(cal2.hashCode());
		

	}

}









