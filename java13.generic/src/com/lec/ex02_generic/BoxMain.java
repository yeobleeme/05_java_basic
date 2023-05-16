package com.lec.ex02_generic;

public class BoxMain {

	public static void main(String[] args) {
		
		Box<Apple> 과일 = new Box();
		과일.setObject(new Apple());
//		과일.setObject(new Hammer());  
		// 에러: 제네릭은 컴파일단계에서 부터 에러방지 가능
		// 객체 저장시 사전에 특정 객체만 주입이 되도록 제한
		
		// 주의사항
		// 좌변에만 제네릭을 정의하면 사전에 에러를 방지할 수 있지만
		// 우변에만 제네릭을 정의하면 non generic과 동일하다.
		// 즉, 우변에만 제네릭을 정의할 경우에는 객체제한을 할 수 없다.
		
		Apple 사과 = 과일.getObject();
		System.out.println(사과);
		
		
		Box<Hammer> 공구 = new Box();
		공구.setObject(new Hammer());
//		공구.setObject(new Apple());  // 에러
		
		Hammer 망치 = 공구.getObject();
		System.out.println(망치);
		
		Box<String> 문자 = new Box<>();
		문자.setObject(new String("아담"));
		String 아담 = 문자.getObject();
		System.out.println(아담);

	}

}

class Box<T> {
	private T t;
	public T getObject() { return t; }
	public void setObject(T t) { this.t = t; }
}

class Apple {
	@Override
	public String toString() {
		return "나는 사과입니다.";
	}
}

class Hammer {
	@Override
	public String toString() {
		return "나는 망치입니다.";
	}
}








