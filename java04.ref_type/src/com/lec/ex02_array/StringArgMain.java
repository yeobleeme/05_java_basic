package com.lec.ex02_array;

public class StringArgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length < 5) {
			System.out.println("배열의 크기 = " + args.length);
			System.out.println("프로그램 종료");
			System.exit(0);  // 0:정상종료, 0이외:비정상종료
		}
		
		int sum = 0;
		for(String arg : args) {
			sum += Integer.parseInt(arg);
		}
		
		System.out.println("1~" + args.length + "까지의 합 = " + sum);

	}

}
