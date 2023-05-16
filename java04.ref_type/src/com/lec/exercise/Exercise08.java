package com.lec.exercise;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 7. Exercise08.java : 
//		    주어진 배열의 전체 항목의 합과 평균값을 구하기.(중첩 for문을 이용) 
//		   
		   int[][] array ={
							{95, 86},
							{83, 92, 96},
							{78, 83, 93, 87, 88}
						  };  
		   
		   int sum = 0;
		   int cnt = 0;
		   double avg = 0.0;
		   
		   for (int i=0; i<array.length; i++) {
			   for (int j=0; j<array[i].length; j++) {
				   sum += array[i][j];
				   cnt++;
			   }
		   }
		   
		   avg = sum/cnt;
		   
		   System.out.println(sum);
		   System.out.println(avg);

	}

}
