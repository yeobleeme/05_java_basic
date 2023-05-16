package exercise10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;


public class Exercise10_6 {

	public static void main(String[] args) {
		
		String birthDay = "19930221";
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		
		try {
			Date fbirthDay = format.parse(birthDay);
			Date today = new Date();
			long days = (today.getTime() - fbirthDay.getTime()) / (24*60*60*1000);
			
			System.out.println(days + " days");
		} catch(ParseException e) {
			e.printStackTrace();
		}
		

//		LocalDate birthDay = LocalDate.of(1993, 2, 21);
//		LocalDate now = LocalDate.now();
//		
//		long days = birthDay.until(now, ChronoUnit.DAYS);
//		
//		System.out.println("birth day: " + birthDay);
//		System.out.println("today: " + now);
//		System.out.println(days+ " days");
		
	}

}
