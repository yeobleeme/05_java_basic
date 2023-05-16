package com.lec.ex11_method.declare;

public class RectangleArea {
	
	// 정사각형의 넓이
	int areaRectangle(int width) {
		return width * width;
	}
	
	// 직사각형의 넓이 - 오버로딩
	int areaRectangle(int width, int height) {
		return width * height;
	}
	

}
