package com.lec.ex10_constructor;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기본생성자 이외의 다른 생성자가 정의되어 있다면
		// 기본생성자는 자동으로 추가되지 않는다. 때문에
		// 기본생성자를 사용하려면 별도로 정의해야 한다. 
		
		Car car1 = new Car();
		Car car2 = new Car("핑크", 3000);
		Car car3 = new Car(3000, "블루");
		

	}

}
