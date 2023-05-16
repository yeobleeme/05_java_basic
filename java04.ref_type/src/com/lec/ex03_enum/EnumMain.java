package com.lec.ex03_enum;

import java.util.Calendar;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("소향");
//		Week today = new Week();  
//		enum은 객체를 생성할 수 없다. (객체화, 인스턴스화) 불가
//		Week 열거타입을 선언했다면 열거타입을 호출해서 사용할 수 있다.
//		열거타입은 하나의 데이터타입(참조타입, 사용자가 정의한 새로운 데이터타입)이므로 변수로
//		선언하고 사용해야 한다. 열거타입 변수를 선언했다면 열거상수를 저장하거나 사용할 수 있다.
//		열거상수는 단독으로 사용할 수 없고, '열거타입.열거상수'의 형태로 사용해야 한다.
//		즉, Week.MONDAY의 형태로 사용해야 한다.
		
		Week today = null;
		System.out.println(today.MONDAY);
		
		
		// 현재의 요일을 확인하기
		// Calendar를 이용하여 날짜를 제어할 수 있다. Calendar는 String이나 System처럼 기본클래스이다.
		
		Calendar cal = Calendar.getInstance();  // new연산자를 사용하지 않고, getInstance()메서드로 객체화한다.
		System.out.println(cal.toString());
		
		cal.get(Calendar.DAY_OF_WEEK);  // DAY_OF_WEEK는 현재의 요일을 int로 리턴
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		// 1=일, ... 7=토
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println();
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		System.out.println("TODAY IS " + today + ".");
		
		
		// 사원 테이블에서 주민번호(7번째) - 남/여 구분
		int gender = 1;  // 7번째 값을 가져왔다.
		if(gender==1 || gender==3) {
			System.out.println("이 사원은 " + Gender.M + " 입니다.");
		}

	}

}














