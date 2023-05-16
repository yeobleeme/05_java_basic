package exercise;

import java.util.stream.Stream;

// 문자열 배열 strArr의 모든 문자열의 길이를 더한 결과를 출력하시오.

// String[] strArr = { "aaa", "bb", "c", "dddd" };

// [실행결과]
// sum = 10

public class Exercise14_5 {

	public static void main(String[] args) {
		
		String[] strArr = { "aaa", "bb", "c", "dddd" };
		Stream<String> strStream = Stream.of(strArr);
		
		int sum = strStream.mapToInt(String::length).sum();
		
		System.out.println("sum = " + sum);

	}

}
