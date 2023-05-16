package exercise;

// 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.

// [실행결과]
// [1, 5]
// [2, 4]
// [3, 3]
// [4, 2]
// [5, 1]

public class Exercise14_4 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++)
				if((i+j)==6) {
					System.out.println("[" + i + ", " + j + "]");
				}
		}

	}

}
