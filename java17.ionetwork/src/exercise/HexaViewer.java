package exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

// 지정된 이진파일의 내용을 실행결과와 같이 16진수로 보여주는 프로그램(HexaViewer.java)을 작성하라. 
// ([Hint]PrintStream과 printf( )를 사용하라.)
 
// [실행결과]
// C:\jdk1.8\work\ch15>java HexaViewer HexaViewer.class 
// CA FE BA BE 00 00 00 31 00 44 0A 00 0C 00 1E 09 
// 00 1F 00 20 08 00 21 0A 00 08 00 22 0A 00 1F 00 
// 23 07 00 24 0A 00 06 00 25 07 00 26 0A 00 08 00 
// 27 0A 00 06 00 28 08 00 29 07 00 2A 0A 00 2B 00 
// 2C 0A 00 08 00 2D 0A 00 08 00 2E 0A 00 06 00 2F 
// 0A 00 08 00 2F 07 00 30 0A 00 12 00 31 07 00 32 
// 01 00 06 3C 69 6E 69 74 3E 01 00 03 28 29 56 01 
// 00 04 43 6F 64 65 01 00 0F 4C 69 6E 65 4E 75 6D 
// 62 65 72 54 61 62 6C 65 01 00 04 6D 61 69 6E 01 
// 00 16 28 5B 4C 6A 61 76 61 2F 6C 61 6E 67 2F 53 
// ... 중간생략
// 
// C:\jdk1.8\work\ch15>

public class HexaViewer {

	public static void main(String[] args) throws IOException {

		if(args.length != 1){
			System.out.println("USAGE: java HexaViewer FILENAME");
			System.exit(0);
		}

		String inputFile = args[0];

		try {
			FileInputStream input = new FileInputStream(inputFile);
			PrintStream output = new PrintStream(System.out);

			int data = 0;
			int i = 0;

			while((data = input.read()) != -1) {
				output.printf("%02X ", data);
				if(++i%16==0)
					output.println();
			}
			input.close();
			output.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}


