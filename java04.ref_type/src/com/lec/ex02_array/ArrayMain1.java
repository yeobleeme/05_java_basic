package com.lec.ex02_array;

public class ArrayMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		   1. 배열이란?
		   
		      변수는 한개의 값만 저장할 수 있다. 하지만 저장할 데이터의 수가 많아지면 그 수 만큼의 변수가
		      필요하게 된다. 이런 방법은 비효율적이고 번거로운 코딩이 된다. 동일 타입의 많은 양의 데이터를
		      사용할 경우 좀 더 효율적인 방법으로 데이터를 저장할 필요가 있는데 이런 방법을 지원하는 것이
		      배열(Array)이다.
		      
		      자바에서 배열은 동일 데이터타입의 데이터를 연속된 공간에 배치시키고 각 데이터의 요소에 
		      인덱스를 부여해서 저장하는 자료구조이다.
		      
		   
		   2. 배열의 선언
		   
		      배열의 선언 방법은 2가지가 있다.
		      1) 데이터타입 [] 변수명 -> 관례
		      2) 데이터타입 변수명 []
		      
		      대괄호[]는 배열을 선언하는 기호가 된다. 대괄호는 데이터타입 뒤 또는 변수명 뒤에 선언할 수 있다.
		      배열은 참조타입. 즉, 객체이기 때문에 배열이 생성될 때 객체는 힙메모리영역에 생성되고 배열변수는
		      스택영역에 생성되어 이 변수는 배열객체가 저장되어 있는 힙영역의 메모리 주소를 참조하게 된다.
		      참조할 배열객체가 없다면 배열변수는 null값으로 초기화 할 수 있다.
		      
		   
		   3. 배열의 생성
		   
		      1) 값 목록으로 생성하는 방법
		      
		         int[] scores = {값1, 값2, ... ,값n};  
		         
		         중괄호{}안에 값의 항목(요소, element)를 갖는 객체로 생성
		      
		      
		      2) new연산자로 생성하는 방법
		      
		         int[] scores = new int[n];
		         
		         new객체 생성연산자로 생성. 
		         new연산자로 생성된 배열은 기본값으로 참조타입은 null, 
		         기본타입은 해당 데이터타입별로 초기값이 저장되기 때문에
		         배열을 생성한 후에 값을 저장해야 한다.
		         
		         값이 저장되지 않은 배열의 요소에 접근하려면 NullPrinterException이 발생.
		         값을 저장하려면 scores[0] = 100; 와 같이 대입연산자를 이용하여 해당 요소에 값을 저장하게 된다.
		      

		   4. 배열의 제약사항
		   
		      1) 배열의 크기(길이)는 한번 정의되면 변경할 수 없다.
		      2) 동일타입 데이터만 저장할 수 있다.
		      3) 배열의 선언은 대괄호[] 로 선언한다.
		      4) 배열에는 index로 접근한다.
		      5) index는 0부터 시작한다.
		
		 */
		
		// 1. 배열의 초기화 및 생성
		int[] scores = {90, 95, 88, 90, 89, 100, 99, 78, 66, 65, 88, 99};
		
		// 1) 힙영역의 메모리주소
		System.out.println(scores);             // 16진수 : 메모리주소
		System.out.println(scores.hashCode());  // 10진수 : 메모리주소
		System.out.println(scores.toString());  // 16진수 : 메모리주소
		System.out.println();

		// 2) index : 접근 방법
		System.out.println(scores[0]);
		System.out.println(scores[1]);
//		System.out.println(scores[-1]);  // 에러 : 음수는 허용하지 않음.
		System.out.println();
		
		// 3) length : 배열의 크기(길이) - read only
		System.out.println(scores.length);
		System.out.println();
		
		// 4) for문과 array
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.print("scores[" + i + "] = " + scores[i] + ", ");
			sum += scores[i];
			System.out.println();
		}
		System.out.println();
		System.out.println("배열 요소의 합계 = " + sum + "\n");
		System.out.println("배열 요소의 평균 = " + (sum / scores.length) + "\n");
		
		sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println();
		System.out.println("배열 요소의 합계 = " + sum + "\n");
		System.out.println("배열 요소의 평균 = " + (sum / scores.length) + "\n");

	}

}















