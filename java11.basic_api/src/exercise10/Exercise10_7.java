package exercise10;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//  2016년 12월 넷째주 화요일의 날짜를 아래의 실행결과와 같은 형식으로 출력하시오.

//  [실행결과]
//  2016-12-27

public class Exercise10_7 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.WEEK_OF_MONTH, 5);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(format.format(cal.getTime()));

	}

}
