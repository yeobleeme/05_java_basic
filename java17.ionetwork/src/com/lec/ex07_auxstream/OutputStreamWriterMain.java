package com.lec.ex07_auxstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterMain {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("c:/Temp/fos.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "보조스트림 : 바이트스트림을 문자스트림으로 변환처리(출력)";
		writer.write(data);
		writer.flush();
		writer.close();
		System.out.println("파일 저장 성공");

	}

}
