package com.lec.exercise;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 6. Exercise06.java : 
//	    for문을 이용해서 삼각형을 출력하는 코드를 작성
//	    1)
//	    *
//	    **
//	    ***
//	    ****
//	    *****
	    for(int i=1; i<=5; i++) {
	    	for(int j=0; j<i; j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println("");
	    }
	    System.out.println();
		
//		2)
//	    *****
//	    ****
//	    ***
//	    **
//	    *
	    for(int i=5; i>=1; i--) {
	    	for(int j=0; j<i; j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println("");
	    }
	    System.out.println();
	    
//	    3)
//	        *
//	       **
//	      ***
//	     ****
//	    *****
	    for(int i=1; i<=5; i++) {
	    	for(int j=5; j>=1; j--) {
	    		if(i<j) {
	    			System.out.print(" ");
	    		} else {
	    			System.out.print("*");
	    		}
	    	}
	    	System.out.println();
	    }
	    System.out.println();
	    
//	    4) 
//	    *****
//	     ****
//	      ***
//	       **
//	        *
	    for(int i=5; i>=1; i--) {
	    	for(int j=5; j>=1; j--) {
	    		if(i<j) {
	    			System.out.print(" ");
	    		} else {
	    			System.out.print("*");
	    		}
	    	}
	    	System.out.println();
	    }
	    System.out.println();
	        
//	    5)	
//	       *
//	      ***
//	     *****
//	    *******
	    for(int i=0; i<4; i++) {
	    	for(int j=0; j<3-i; j++) {
	    		System.out.print(" ");
	    	}
	    	for(int j=0; j<2*i+1; j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    System.out.println();
	    
//	    6)
//	    *******
//	     *****
//	      ***
//	       *
	    int num= 4;
	    for(int i=num; i>0; i--) {
	    	for(int j=num-i; j>0; j--) {
	    		System.out.print(" ");
	    	} for(int k=i*2-1; k>0; k--) {
	    		System.out.print("*");
	    	} System.out.println();
	    }
	    System.out.println();


	       
//	    7)
//	       *
//	      ***
//	     *****
//	    *******      
//	     *****
//	      ***
//	       *  
	    num = 4;
	    for(int i=0; i<num; i++) {
	    	for(int j=num-i-1; j>0; j--) {
	    		System.out.print(" ");
	    	} for(int k=0; k<i*2+1; k++) {
	    		System.out.print("*");
	    	} System.out.println();
	    } for(int i=0; i<num; i++) {
	    	for(int j=0; j<i+1; j++) {
	    		System.out.print(" ");
	    	} for(int k=(num-i-1)*2-1; k>0; k--) {
	    		System.out.print("*");
	    	} System.out.println();
	    }

	}

}
