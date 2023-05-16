package exercise;

import java.util.Comparator;
import java.util.stream.Stream;

// 문자열 배열 strArr의 문자열 중에서 가장 긴 것의 길이를 출력하시오.

// String[] strArr = { "aaa", "bb", "c", "dddd" };

// [실행결과]
// 4

public class Exercise14_6 {

	public static void main(String[] args) {
		
		String[] strArr = { "aaa", "bb", "c", "dddd" };
		Stream<String> strStream = Stream.of(strArr);
		
		strStream.map(String::length)
		         .sorted(Comparator.reverseOrder())
		         .limit(1).forEach(System.out::println);
		

	}

}
