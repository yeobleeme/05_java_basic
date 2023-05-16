package com.lec.ex10_abstract_method;

public class AnimalMain {

	public static void main(String[] args) {
		
		// 1. 추상클래스와 구현(실체)클래스
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		dog.breath();
		cat.breath();
		bird.breath();
		tiger.breath();
		lion.breath();
		dog.sound();
		cat.sound();
		bird.sound();
		tiger.sound();
		lion.sound();
		
		
		// 2. 객체를 메서드의 매개변수로 전달
		animalSound(dog);
		animalSound(cat);
		animalSound(bird);
		animalSound(tiger);
		animalSound(lion);

	}

	private static void animalSound(Animal animal) {
		animal.sound();  // 자동형변환
		
	}

	
//	private static void animalSound(Dog dog) {
//		dog.sound();
//	}
//	private static void animalSound(Cat cat) {
//		cat.sound();
//	}
//	private static void animalSound(Bird bird) {
//		bird.sound();
//	}
//	private static void animalSound(Tiger tiger) {
//		tiger.sound();
//	}
//	private static void animalSound(Lion lion) {
//		lion.sound();
//	}


}








