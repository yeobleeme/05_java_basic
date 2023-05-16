package com.lec.ex08_casting;

/*
    참조 타입의 강제 타입 변환: Casting
    
    강제 타입 변환은 부모 타입을 자식 타입으로 변환하는 것을 말한다.
    형 변환이 된다고 해서 모든 부모 타입이 자식 타입으로 강제 형 변환할 수 있는 것은 아니다.
    
    강제 타입 변환이 되는 경우는 자식 타입이 부모 타입으로 형 변환이 된 후에 자식 타입으로
    변환되는 경우에만 강제 타입 변환을 할 수 있다.
    
    자식 타입이 부모 타입으로 자동 형 변환하면 부모 타입에 선언된 필드와 메서드만 
    사용할 수가 있다. 자식 타입이 부모 타입으로 자동 형 변환이 되면 부모 타입에서 선언된
    필드와 메서드만 사용할 수 있다. 만약, 자식 타입에 선언된 필드와 메서드를 꼭 사용해야 하는
    경우에는 강제 형 변환을 해서 다시 자식 타입으로 변환한 후에 자식 타입의 필드와 메서드를
    사용할 수 있다. 
*/

public class CastingMain {

	public static void main(String[] args) {
		
		// 1. 자동 형 변환
		Parent parent = new Child();  // 생성과 동시에 자동 형 변환
		parent.field1 = "사용가능";
//		parent.field2 = "사용불가";  
		parent.method1();
		parent.method2();  // 사용할 수 있지만 child에서 재정의된 메서드
//		parent.method3();
		
		// 2. 강제 형 변환
		// 1) 형 변환 불가
		// 직접 생성한 부모 객체에서 자식 객체로 형 변환하는 경우는 불가
		// 자식 객체 -> 부모 객체 -> 자식 객체의 순서로 형 변환하는 것은 가능하지만
		// 부모 객체 -> (부모 타입) 자식 객체로 직접 형 변환하는 것은 불가능
		int val = (int) 1.0d;  // 강제 형 변환
		Parent parent2 = new Parent();
		
		// 문법 에러는 아니지만 실행시에 에러 발생 - java.lang.ClassCastException
//		Child child = (Child) parent2; 
		
		// 2) 형 변환 가능
		Child child = (Child) parent;
		child.field1 = "사용가능";
		child.field2 = "사용가능";
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		System.out.println("parent2 = " + parent2.getClass());
		System.out.println("parent = " + parent.getClass());
		System.out.println("child = " + child.getClass());
		System.out.println();
		
		

	}

}













