package com.lec.ex02_arithmetic;

public class CheckOverflowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("-- Overflow Occured --");
		}
		
		
		

	}

	public static int safeAdd(int x, int y) {
		
		if(x>0) {
			if(x > (Integer.MAX_VALUE - y)) {
				// 강제로 예외를 발생시키는 방법
				throw new ArithmeticException("Overflow Occured");
			}
		} else {
		    if(x < (Integer.MIN_VALUE - y)) {
		    	throw new ArithmeticException("Overflow Occured");
		    }
		}
		return x + y;
		
	}
	
}
