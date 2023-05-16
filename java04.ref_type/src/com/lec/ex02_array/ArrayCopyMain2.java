package com.lec.ex02_array;

import java.util.Arrays;

public class ArrayCopyMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*

   배열의 복사
   
   참조타입인 배열의 경우, 배열 복사가 되면 복사되는 값이 객체의 메모리주소이기 때문에
   새 배열의 항목은 이전 배열이 참조하는 객체의 메모리주소와 동일하다.
   
   이 것을 '얕은복사:shallowcopy' 라고 한다. 반대로 '깊은복사:deepcopy' 는 참조하는
   객체를 별도로 생성해서 복사하는 것을 말한다. 
   
   
   Array 복사
   
   자바에서는 배열을 한번 생성하면 크기를 변경할 수 없기 때문에 더 많은 요소를 저장하려면 
   보다 큰 배열을 새로 만들고 이전 배열에서 항목값들을 복사해야 한다.
   배열 간 항목을 복사하려면 for문을 이용하거나 System.arrayCopy(), Arrays.copy()메서드를
   사용해서 깊은복사를 한다.
 
*/
		
		// 1. 얕은복사
		String[] oldArray = {"java", "array", "copy"};
		String[] newArray = oldArray;
		
		oldArray[0] = "python";
		
		System.out.print("oldArray = ");
		for(String o : oldArray) {
			System.out.print(o + ", ");
		}
		System.out.println();
		
		System.out.print("newArray = ");
		for(String n : newArray) {
			System.out.print(n + ", ");
		}
		System.out.println("\n-------------------------------");
		
		
		// 2. 깊은복사
		
		// 1) for문
		String[] old1 = {"소향", "거미", "나얼"};
		String[] new1 = new String[3];
		for(int i=0; i<old1.length; i++) {
			new1[i] = old1[i];
		}
		
		old1[1] = "손흥민";
		
		System.out.print("old1 = ");
		for(String o : old1) {
			System.out.print(o + ", ");
		}
		System.out.println();
		
		System.out.print("new1 = ");
		for(String n : new1) {
			System.out.print(n + ", ");
		}
		System.out.println("\n-------------------------------");
		
		
		// 2) System.arraycopy(old, old시작, new, new시작, old크기) 이용
		String[] old2 = {"소향", "거미", "나얼"};
		String[] new2 = new String[6];
		System.arraycopy(old2, 0, new2, 0, old2.length);
		
		new2[0] = "김민재";
		new2[3] = "BTS";
		new2[4] = "BLP";
		new2[5] = "NJS";
		
		System.out.print("old2 = ");
		for(String o : old2) {
			System.out.print(o + ", ");
		}
		System.out.println();
		
		System.out.print("new2 = ");
		for(String n : new2) {
			System.out.print(n + ", ");
		}
		System.out.println("\n-------------------------------");
		
		
		// 3) Arrays.copyOf(src, new.length) 이용
		int[] old3 = {1,2,3,4,5};
		int[] new3 = Arrays.copyOf(old3, 3);
		
		System.out.print("old3 = ");
		for(int o : old3) {
			System.out.print(o + ", ");
		}
		System.out.println();
		
		System.out.print("new3 = ");
		for(int n : new3) {
			System.out.print(n + ", ");
		}
		System.out.println("\n-------------------------------");
		
		
		// a. Arrays.copyOfRange(src, start, end-1) 이용
		int[] new4 = Arrays.copyOfRange(old3, 1, 4);
		
		System.out.print("new4 = ");
		for(int o : new4) {
			System.out.print(o + ", ");
		}
		

	}

}













