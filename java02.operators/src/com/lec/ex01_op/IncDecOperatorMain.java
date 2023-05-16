package com.lec.ex01_op;

public class IncDecOperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
   증감 연산자 (++, --)
   
   증감 연산자는 변수의 값을 1씩 증가(++), 1씩 감소(--) 시키는 연산자를 말한다.
   boolean타입을 제외한 모든 기본 데이터타입의 피연산자에 사용할 수 있다.
   증감 연산자는 선언 위치에 따라 후위, 전위 증감 연산자로 구분이 된다.
   변수 앞에 정의된 것을 전위 증감 연산자, 변수 뒤에 정의된 것을 후위 증감 연산자라고 한다.
   
   주의할 점은 다른 연산자와 함께 사용되는 연산식에서는 증감 연산자의 위치에 따라
   연산 결과가 다르게 나오므로 주의해야 한다.
   
   전위 연산자는 연산 전에 증감을 시키고, 후위 연산자는 연산을 한 후 증감을 시킨다.
*/

		
		int x = 10;
		int y = 10;
		int z;
		
		x++;  // x = x + 1;
		++x;  // x = x + 1;
		System.out.println("x = " + x);
		System.out.println();
		
		y--;
		--y;
		
		System.out.println("y = " + y);
		System.out.println();
		
		z= x++;  // z = 12, ++x z = 13
		System.out.println("z = " + z);  // z = 12
		System.out.println("x = " + x);  // x = 13
		System.out.println(); 
		
		z = ++x;
		System.out.println("z = " + z);  // z = 14
		System.out.println("x = " + x);  // x = 14
		System.out.println();
		
		z = ++x + y--;  // x = 14, y = 8
		System.out.println("z = " + z);  // z = 23
		System.out.println("x = " + x);  // x = 15
		System.out.println("y = " + y);  // y = 7
		System.out.println();
		
		
	}

}
















