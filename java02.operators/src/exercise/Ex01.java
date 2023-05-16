package exercise;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java02_ex01_02
		int x = 10;
		int y = 20;
		int z=(++x) + (y--);
		System.out.println(z);  // 11 + 20 = 31
		System.out.println();
		
		
		// Java02_ex01_03
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result);  // (score=85) !(score>90) true -> "가"
		System.out.println();
		
		
		// Java02_ex02_04
		int pencils = 534;
		int students = 30;
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		// 남은 연필 수
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		System.out.println();
		
		
		// Java02_ex02_05
		int value = 356;
		System.out.println(Math.round(value / 100) * 100);
		System.out.println();
		
		
		// Java02_ex02_06
		int lenghTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lenghTop + lengthBottom) * height);
		System.out.println(area);
		System.out.println();
		
		
		// Java02_ex02_07
		int a = 10;
		int b = 5;
		System.out.println((a>7) && (b<=5));  // true
		System.out.println((a%3 == 2) || (b%2 != 1));  // false
		System.out.println();
		
		
		// Java02_ex02_08
		double d1 = 5.0;
		double d2 = 0.0;
		double d3 = d1%d2;
		if(Double.isNaN(d3)) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			double result1 = d3+10;
			System.out.println("결과 : " + result1);
		}

	}

}














