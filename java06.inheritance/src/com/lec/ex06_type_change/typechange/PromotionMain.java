package com.lec.ex06_type_change.typechange;

import com.lec.ex06_type_change.method.A;
import com.lec.ex06_type_change.method.B;
import com.lec.ex06_type_change.method.C;
import com.lec.ex06_type_change.method.D;
import com.lec.ex06_type_change.method.E;

/*
    타입 변환과 다형성
    
    다형성이란? 동일 타입이지만 실행 결과가 다양한 형태의 객체를 이용할 수 있는 성질을 말한다.
    프로그램 측면에서 보면 다형성의 하나의 타입에 여러 형태의 객체를 대입함으로써 
    다양한 기능을 수행할 수 있게 한다. 
    
    다형성을 위해서 Java는 자식 클래스가 부모 클래스로의 타입 변환을 허용한다.
    즉, 부모 타입에 모든 자식 객체들을 대입할 수 있다는 것이다.
    이 기능을 이용한다면 모든 객체는 부품화가 가능해 진다.
    
    타입 변환이란? 데이터 타입을 다른 데이터 타입으로 변환하는 행위를 말한다.
    기본 데이터 타입의 변환 처럼 참조타입(class, array, interface, enum)도 타입 변환이 가능하다.
    클래스 타입 변환은 직접적인 상속 관계가 있는 클래스 사이에서만 타입 변환이 가능하다.
    
    자동 타입 변환: promotion은 프로그램 실행 도중 자동적으로 타입 변환이 일어나는 것을 말한다.
    자동 타입 변환 개념은 자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 
    취급될 수 있다는 것이다.
    
    주의할 점은 자동 타입 변환이 된 후에는 부모 클래스에 선언된 필드와 메서드만 접근이 가능하다.
    비록 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스의 멤버로만 제한된다.
    그러나 예외가 있는데 메서드가 자식 클래스에서 오버라이드 되었다면 부모 클래스의 메서드가
    호출되는 것이 아니라 자식 클래스의 메서드가 호출된다.
*/

public class PromotionMain {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동 형 변환
		// 1. 직접 상속 관계가 있을 경우 = 가능
//		a = b;
//		a = c;
//		a = d;
//		a = e;
//		
//		b = d;
//		c = e;
		
		// 2. 직접 상속 관계가 없을 경우 = 불가능
//		b = e;  // 불가능
//		c = d;  // 불가능
		
		// 3. 메서드의 매개변수로 전달 
		method_a(1);
		method_a("참조(문자열)");
		
		System.out.println();
		
		method_a(a);
		method_a(b);
		method_a(c);
		method_a(d);
		method_a(e);
		
		System.out.println();
				
//		method_b(a);
		method_b(b);
//		method_b(c);
		method_b(d);
//		method_b(e);
		

	}
	
	static void method_a(double a) { System.out.println("정수형 = " + a); }
	static void method_a(String a) { System.out.println("참조(문자열) = " + a.getClass());}
	static void method_a(A a) { System.out.println("A = " + a.getClass()); }
	static void method_b(B b) { System.out.println("B = " + b.getClass()); }

}












