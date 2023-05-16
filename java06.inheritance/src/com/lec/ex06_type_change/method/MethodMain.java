package com.lec.ex06_type_change.method;

import com.lec.ex06_type_change.typechange.Parent;

public class MethodMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();  // Parent
		child.method2();  // Child -> Parent.method2 재정의
		child.method3();  // Child -> Child에 새로 추가된 메서드
		System.out.println();
		
		// 1. 자동 형 변환 후에는? 자식 객체에서 부모 객체로 형 변환
		Parent parent = child;  // 자동 형 변환
		
//		1) method1은 부모 객체의 method1 호출
		parent.method1();
		
//		2) method2는 자식 객체에서 재정의 되었기 때문에
//		   자식 객체의 메서드 즉, child.method2() 호출
		parent.method2();
		
//		3) method3는 자식 객체에서 새롭게 추가된 메서드이기 때문에
//		   부모 객체로 타입 변환시에 삭제(짤림)되기에 호출 불가
//		parent.method3();  // 
		System.out.println();
		
		// 2. parent와 child가 동일 타입인지 여부를 비교
		System.out.println(parent == child);  // true: child -> parent로 형 변환 (동일타입)
		System.out.println(parent.equals(child));  // true
		System.out.println();
		
		Parent parent2 = new Parent();
		System.out.println(parent2 == child);  // false
		System.out.println(parent2.equals(child));  // false
		System.out.println();
		
		System.out.println("parent = " + parent.getClass());
		System.out.println("child = " + child.getClass());
		System.out.println("parent = " + parent2.getClass());
		System.out.println();

		System.out.println(new Parent() == parent2);  
		System.out.println((new Parent()).equals(parent2));
		System.out.println("new Parent() = " + (new Parent()).getClass());
		System.out.println();
		
		// 1. child -> parent -> child 강제 형 변환
		child = (Child) parent;
		child.method1();  // Parent
		child.method2();  // Child -> Parent.method2 재정의
		child.method3();  // Child -> Child에 새로 추가된 메서드
		System.out.println();
		
		// 2. parent2 -> child 강제 형 변환 -> 형 변환 불가: ClassCastException
//		child = (Child) parent2;  // 에러
		
	}

}








