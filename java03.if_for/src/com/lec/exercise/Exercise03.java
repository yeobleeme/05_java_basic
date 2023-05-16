package com.lec.exercise;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 3. Exercise03.java : 
//	    for문을 이용해서 1~100까지의 정수중 3의 배수총합을 구하는 코드
		
	    int sum = 0;
	    for(int i=1; i<=100; i++) {
	    	if(i%3==0) {
	    		sum += i;
	    	}
	    }
	    System.out.println(sum);
	    System.out.println();

	}

}