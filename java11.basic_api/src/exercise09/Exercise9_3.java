package exercise09;

public class Exercise9_3 {

	public static void main(String[] args) {
		
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = ""; 

		/* (1) 알맞은 코드를 넣어 완성하시오  . */
		path = fullPath.substring(0,14);
		fileName = fullPath.substring(15);

		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);

	}

}



//  [실행결과]
//  fullPath:c:\jdk1.8\work\PathSeparateTest.java 
//  path:c:\jdk1.8\work 
//  fileName:PathSeparateTest.java


