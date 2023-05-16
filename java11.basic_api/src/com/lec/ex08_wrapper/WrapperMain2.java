package com.lec.ex08_wrapper;

public class WrapperMain2 {

	public static void main(String[] args) {
		
		// 포장객체 비교
		// 포장객체는 내부값을 비교하기 위해 동등연산자: ==, != 를 사용할 수 없다.
		// 동등연산자는 내부의 값으로 비교하는 것이 아니라 
		// 포장객체의 참조 메모리주소로 비교하기 때문이다.
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);  // false
		System.out.println();
		
		// 따라서, 내부의 값만 비교하려면 언박싱한 값을 비교해야 한다.
		System.out.println("언박싱 후 비교: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals()메서드 비교: " + obj1.equals(obj2));
		System.out.println();
		

	}

}
