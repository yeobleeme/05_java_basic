package exercise;

import java.util.Random;

// 임의의 로또번호(1~45)를 정렬해서 출력하시오.

// [실행결과]
// 1
// 20
// 25
// 33
// 35
// 42

public class Exercise14_7 {

	public static void main(String[] args) {
		
		new Random().ints(1, 46)
		            .distinct()
		            .limit(6)
		            .sorted()
		            .forEach(System.out::println);

	}

}
