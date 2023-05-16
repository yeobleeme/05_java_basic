package com.lec.ex07_inheritance;

/*
    제네릭타입의 상속:extends 과 구현:implements
    
    제네릭타입도 다른 타입과 마찬가지로 부모클래스가 될 수 있다.
    부모클래스에서 상속받은 자식클래스는 부모클래스에 정의된 타입을 정의해야 한다.
    
    또한, 자식클래스는 타입파라미터를 추가할 수 있으며 제네릭 인터페이스를 구현한
    클래스에서도 제네릭타입으로 정의되어야 한다.
*/

public class ExtendsMain {

	public static void main(String[] args) {
		
		// 1. 클래스(Product)
		ChildProduct<TV, String, String> tv = new ChildProduct();
		tv.setKind(new TV());  // 부모의 제네릭타입
		tv.setModel("SMART OLED TV");  // 부모의 제네릭타입
		tv.setCompany("LG ELECTRONICS");  // 자식의 제네릭타입
		System.out.println(tv.toString());
		
		ChildProduct<Car, String, String> car = new ChildProduct();
		car.setKind(new Car());  // 부모의 제네릭타입
		car.setModel("S500");  // 부모의 제네릭타입
		car.setCompany("MERCEDEZ BENZ");  // 자식의 제네릭타입
		System.out.println(car.toString());
		
		System.out.println();
		
		// 2. 인터페이스(Storage)
		Storage<TV> tvWH = new StorageImpl<>(100);
		tvWH.add(new TV(), 10);  // 창고 100 중 10번 위치
		TV tv1 = tvWH.get(10);
		System.out.println(tv1.getClass());
		
		Storage<Car> carWH = new StorageImpl<>(10);
		carWH.add(new Car(), 1);  // 창고 10 중 1번 위치
		Car car1 = carWH.get(1);
		System.out.println(car1.getClass());
		

	}

}












