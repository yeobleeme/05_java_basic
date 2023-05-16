package exercise10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//    화면으로부터 날짜를 "2007/05/11"의 형태로 입력받아서 무슨 요일인지 출력하는 프로그램을 작성하시오.
//    단, 입력된 날짜의 형식이 잘못된 경우 메세지를 보여주고 다시 입력받아야 한다.

//  [실행결과]
//  날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력예:2007/05/11)
//  >>2009-12-12
//  날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력예:2007/05/11)
//  >>2009/12/12
//  입력하신 날짜는 토요일입니다.


public class Exercise10_4 {

	public static void main(String[] args) {
		
		String pattern1 = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일 입니다.";
		
		DateFormat df1 = new SimpleDateFormat(pattern1);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println("날짜를 " + pattern1 + "의 형태로 입력해주세요. (입력예:2007/05/11)");
			
			try{
				System.out.print(">>");
				inDate = df1.parse(s.nextLine());
				break;
				
			}catch(Exception e){}
			
		} while(true);

		System.out.println(df2.format(inDate));

	}

}











