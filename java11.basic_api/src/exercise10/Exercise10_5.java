package exercise10;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//  다음과 같이 정의된 메서드를 작성하고 테스트하시오. 

//  메서드명: getDayDiff
//      기능: yyyymmdd형식의 두 문자열을 넘겨받으면 두 날짜의 차이를 일(day)단위로 반환한다.
//            단, 첫 번째 날짜 빼기 두 번째 날짜의 결과를 반환한다.
//            만일 주어진 문자열이 유효하지 않으면 0을 반환한다.
//  반환타입: int
//  매개변수: String yyyymmdd1 - 시작 날짜                                                                                                                         
//            String yyyymmdd2 - 끝 날짜

//  [실행결과]
//  2
//  0
//  0

import java.util.*;

class Exercise10_5 { 

	public static void main(String[]args){ 

		System.out.println(getDayDiff("20010103","20010101")); 
		System.out.println(getDayDiff("20010103","20010103")); 
		System.out.println(getDayDiff("20010103","200103")); 

	}

	private static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		int ret = 0;
		
		try {
			Date date1 = format.parse(yyyymmdd1);
			Date date2 = format.parse(yyyymmdd2);
			
			long diff = (date1.getTime() - date2.getTime()) / (24*60*60*1000);
			
			ret = (int) Math.abs(diff);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return ret;
		
		
	}

}









