package com.lec.ex01_interface;

public class AnimalMain {

	public static void main(String[] args) {
		
//		Animal animal = new Animal();  // 인터페이스: 객체 생성 불가
		
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Bird());

	}

	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breath();
		
	}

}

class Bird implements Animal {
	
	@Override
	public void sound() {
		System.out.println("짹짹");
		
	}
	
//	@Override
//	public void breath() {
//		System.out.println("숨을 쉽니다.");
//		
//	}
}
