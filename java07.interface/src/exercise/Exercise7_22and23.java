//package exercise;
//
////  [7-22] 아래는 도형을 정의한 Shape클래스이다. 
////  이 클래스를 조상으로 하는 Circle클래스와 Rectangle클래스를 작성하시오. 
////  이 때, 생성자도 각 클래스에 맞게 적절히 추가해야 한다.
//
//abstract class Shape {
//
//	Point p;
//
//	Shape() {
//		this(new Point(0, 0));
//	}
//
//	Shape(Point p) {
//		this.p = p;
//	}
//
//	
//	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
//
//	Point getPosition() {
//		return p;
//	}
//
//	void setPosition(Point p) {
//		this.p = p;
//	}
//}
//
//class Cricle extends Shape {
//	
//	double r;
//	
//	public Circle(double r) {
//		super();
//		this.r = r;
//	}
//	
//	Cricle(double r) {
//		this(new Point(0, 0), r); 
//	}
//	
//	Circle(Point p, double r) {
//		super(p);
//		this.r = r;
//	}
//
//	@Override
//	double calcArea() {
//		return r * r * Math.PI;
//	}
//	
//}
//
//class Rectangle extends Shape {
//
//	double width;
//	double height;
//
//	public Rectangle(double width, double height) {
//		super();
//		this.width = width;
//		this.height = height;
//	}
//
//    Rect(double width, double height) {
//        this(new Point(0,0), width, height);
//    }
//
//    Rect(Point p, double width, double height) {
//        super(p); 
//        this.width = width;
//        this.height = height;
//    }
//
//	@Override
//	double calcArea() {
//		return width * height;
//	}
//
//	boolean isSquare(){
//		return width*height!=0 &&(width == height); 
//	}
//
//}
//
//
//
//class Point {
//	
//	int x;
//	int y;
//
//	Point() {
//		this(0, 0);
//	}
//
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	public String toString() {
//		return "[" + x + "," + y + "]";
//	}
//}
//
//
//public class Exercise7_22and23 {
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}









