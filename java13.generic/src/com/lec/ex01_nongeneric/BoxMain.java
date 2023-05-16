package com.lec.ex01_nongeneric;

public class BoxMain {

	public static void main(String[] args) {
		
		Box 과일 = new Box();
		과일.setObject(new Apple());  // 자동형변환 Apple -> Object
		Apple 사과 = (Apple) 과일.getObject();  // 강제형변환 Object -> Apple 
		System.out.println(사과);
		System.out.println(사과.getClass());
		과일.setObject(new Hammer());
		Hammer 망치 = (Hammer) 과일.getObject();  
		System.out.println(망치);
		System.out.println(망치.getClass());
		
		System.out.println();
		
		Box 공구 = new Box();
		공구.setObject(new Hammer());  // 자동형변환 Hammer -> Object
		망치 = (Hammer) 공구.getObject();  // 강제형변환 Object -> Hammer
		System.out.println(망치);
		System.out.println(망치.getClass());
		
		공구.setObject(new Apple());
		사과 = (Apple) 공구.getObject();
		System.out.println(사과.getClass());

		
		공구.setObject(new String("아담"));
		String 아담 = (String) 공구.getObject();
		System.out.println(아담.getClass());
		
		과일.setObject(new String("홍길동"));
		과일.setObject(Integer.valueOf(1));
		과일.setObject(Double.valueOf(1.0));
		과일.setObject('A');
		과일.setObject(new int[] {1,2,3,4,5});
		
	}

}

class Box {
	
	private Object object;
	
	public Object getObject() { return this.object; }
	public void setObject(Object object) { this.object = object; } 
	
}


class Apple {}
class Banana {}
class Hammer {}
class Driver {}




