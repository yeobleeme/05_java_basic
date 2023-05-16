package com.lec.ex11_method.declare;

public class RectangleAreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메서드의 오버로딩
		RectangleArea ra = new RectangleArea();
		int result = ra.areaRectangle(20);
		System.out.println("정사각형의 넓이 = " + result);
		
		result = ra.areaRectangle(30, 10);
		System.out.println("직사각형의 넓이 = " + result);

	}

}
