package com.lec.ex01_object_ex01_equals;

/*
    객체 비교: 객체.equals(Object object)
    
    equals 메서드는 매개타입인 Object인데 이 것은 모든 객체가 매매값을 대입할 수 
    있다는 것이다. 그 이유는 Object가 최상위 클래스이므로 모든 객체는 Object 타입으로
    자동형변환 될 수 있기 때문이다. 
    
    Java에서는 두 객체를 비교할 때 동등연산자(==)가 아닌 equals()메서드를 사용한다.
    두 객체를 비교해서 논리적으로 동등하면 true, 아니면 false를 리턴한다.
    
    equals 메서드를 재정의할 때 매개값(비교객체)이 기준 객체와 동일한 타입의 객체 인지를 
    먼저 확인해야 하나. Object 타입의 매개변수는 모든 객체가 매개값으로 
*/

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Member) {
			Member member = (Member) object;
			if(id.equals(member.id) ) {
				return true;
			} 
		} else {
			System.out.println("NOT Member Reference Type");
		}
		return false;
	}

}





