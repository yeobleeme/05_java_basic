package com.lec.exercise;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 6. Exercise07.java : 
//		    주어진 배열의 항목에서 최대값을 구하기.(for문을 이용)
//		   
		   int[] array1={1,5,3,8,2};
		   
		   int max = array1[0];
		   
		   for(int i=1; i<array1.length; i++) {
			   if(array1[i] > max) {
				   max = array1[i];
			   }
		   }
		   System.out.println(max);

	}

}
