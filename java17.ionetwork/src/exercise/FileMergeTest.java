package exercise;

// 커맨드라인으로부터 여러 파일의 이름을 입력받고, 
// 이 파일들을 순서대로 합쳐서 새로운 파일을 만들어내는 프로그램(FileMergeTest.java)을 작성하시오. 
// 단, 합칠 파일의 개수에는 제한을 두지 않는다.

// [실행결과]
// C:\jdk1.8\work\ch15>java FileMergeTest 
// USAGE: java FileMergeTest MERGE_FILENAME FILENAME1 FILENAME2 ... 
// 
// C:\jdk1.8\work\ch15>java FileMergeTest result.txt 1.txt 2.txt 3.txt 
// 
// C:\jdk1.8\work\ch15>type result.txt 
// 1111111111 
// 2222222222 
// 33333333333333 
// 
// C:\jdk1.8\work\ch15>java FileMergeTest result.txt 1.txt 2.txt 
// 
// C:\jdk1.8\work\ch15>type result.txt 
// 1111111111 
// 2222222222 
// 
// C:\jdk1.8\work\ch15>type 1.txt 
// 1111111111 
// 
// C:\jdk1.8\work\ch15>type 2.txt 
// 2222222222 
// 
// C:\jdk1.8\work\ch15>type 3.txt 
// 33333333333333 
// 
// C:\jdk1.8\work\ch15>

import java.io.*;
import java.util.*;

public class FileMergeTest {

	public static void main(String[] args){

		if(args.length < 2){
			System.out.println("USAGE: java FileMergeTest MERGE_FILENAME FILENAME1 FILENAME2 ... ");
			System.exit(0);
		}
		try{
			Vector v = new Vector();

			for(int i=1; i<args.length;i++){
				File f = new File(args[i]);

				if(f.exists()) {
					v.add(new FileInputStream(args[i]));
				}else{
					System.out.println(args[i] + " - 존재하지 않는 파일입니다. ");
					System.exit(0);
				}
			}

			SequenceInputStream input = new SequenceInputStream(v.elements());
			FileOutputStream output = new FileOutputStream(args[0]);

			int data = 0;

			while((data = input.read()) != -1){
				output.write(data);
			}
		} catch(IOException e) {}

	}

}


