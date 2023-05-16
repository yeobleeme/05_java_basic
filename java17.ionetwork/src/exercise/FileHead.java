package exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// 커맨드라인으로부터 파일명과 숫자를 입력받아서, 
// 입력받은 파일의 내용의 처음부터 입력받은 숫자만큼의 라인을 
// 출력하는 프로그램(FileHead.java)을 작성하라.
// ([Hint] BufferedReader의 readLine( )을 사용하라.)

// [실행결과]
// C:\jdk1.8\work\ch15>java FileHead 10 
// USAGE: java FileHead 10 FILENAME 
// 
// C:\jdk1.8\work\ch15>java FileHead 10 aaa 
// aaa은/는 디렉토리이거나, 존재하지 않는 파일입니다. 
// 
// C:\jdk1.8\work\ch15>java FileHead 10 FileHead.java 
// 1:import java.io.*; 
// 2: 
// 3:class FileHead 
// 4:{ 
// 5:     public static void main(String[] args) 
// 6:     { 
// 7:         try { 
// 8:                 int line = Integer.parseInt(args[0]); 
// 9:                 String fileName = args[1]; 
// 10: 
//
// C:\jdk1.8\work\ch15>

public class FileHead {

	public static void main(String[] args) {
		
		try {
			int lineNum = Integer.parseInt(args[0]);
			String fileName = args[1];
			
			File f = new File(fileName);
			
			if (f.exists() && !f.isDirectory()) {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				
				String line = "";
				int i = 1;
				
				while((line = br.readLine()) != null && i <= lineNum) {
					System.out.println(i + ":" + line);
					i++;
				}
			} else {
				throw new FileNotFoundException(fileName + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("USAGE: java FileHead 10 FILENAME");
			
		}

	}

}









