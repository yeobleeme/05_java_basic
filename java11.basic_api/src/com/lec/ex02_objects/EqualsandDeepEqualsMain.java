package com.lec.ex02_objects;

import java.util.Objects;

/*
Objects 클래스

Object 클래스와 유사한 이름을 가진 java.util.Objects 클래스는 
객체의 비교, 해쉬코드 생성, null 여부, 객체 문자열의 리턴 등의 연산을 수행하는
static 메서드로 구성된 Object의 유틸리티 클래스이다.

1. 객체비교: compare(T a, T b, Comparator<T> c) 
   
   Objects.compare() 메서드는 2개의 객체를 비교해서 int값(-1(작음), 0(같음), 1(큼))을 리턴한다.
   java.util.Compare<T>는 제네릭 인터페이스 타입으로 
   두 객체를 비교하는 compare(a, b) 메서드가 정의되어 있다.

2. 동등비교: equals(), deepEquals()

   Objects.equals(Object a, Object b) 메서드는 2개 객체의 동등비교를 하는데
   1) a와 b가 모두 null일 경우 true
   2) a와 b가 모두 not null일 경우 a.equals(b)의 결과를 리턴
   
   Objects.deepEquals(Object a, Object b) 메서드 역시 2개의 객체의 동등비교를 하는데
   1) a와 b가 서로 다른 배열일 경우, 항목의 값이 모두 같다면 true를 리턴
   2) 이 메서드는 Arrays.deepEquals(Object[] a, Object[] b)와 동일하다.
       
3. 해쉬코드 생성: hash(), hashCode() 

   Objects.hash(Object... value) 메서드는 주어진 값들을 이용해서 해쉬코드를 생성하는
   기능을 하는데 주어진 매개값들로 배열을 생성하고 Arrays.hashCode(Object[] a)를 호출해서
   해쉬코드를 얻고 이 값을 리턴한다.
   
   이 메서드는 클래스가 hashCode()를 재정의할 때 리턴값을 생성하기 위해 사용하면 좋다.
   클래스가 여러가지 필드를 가지고 있을 때 이 필드들로 부터 해쉬코드를 생성하게 되면
   동일한 필드값을 가지는 객체는 동일한 해쉬코드를 얻을 수 있다.
*/

public class EqualsandDeepEqualsMain {

	public static void main(String[] args) {
		
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));  // true
		System.out.println(Objects.equals(o1, null));  // false
		System.out.println(Objects.equals(null, o2));  // false
		System.out.println(Objects.equals(null, null));  // true
		System.out.println(Objects.deepEquals(o1, o2));  // true
		System.out.println();
		
		Integer[] a1 = {1, 2, 3};
		Integer[] a2 = {1, 2, 3};
		System.out.println(Objects.equals(a1, a2));  // false
		System.out.println(Objects.deepEquals(a1, a2));  // true
		System.out.println(Objects.deepEquals(a1, null));  // false
		System.out.println(Objects.deepEquals(null, a2));  // false
		System.out.println(Objects.deepEquals(null, null));  // true
		System.out.println();
	}

}










