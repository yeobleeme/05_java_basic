package com.lec.ex03_channel;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
    File Channel
    
    java.nio.channel.FileChannel 클래스를 이용하면 파일 읽기와 쓰기를 할 수 있다.
    FileChannel은 동기화 처리가 되어있기 때문에 멀티쓰레드환경에서 사용해도 안전하다.
    
    1. FileChannel 생성과 닫기
    
       FileChannel.open() 정적메서드 호출 또는 File.FileInputStream, FileOutputStream의
       getChannel()메서드를 호출해서 FileChannel객체를 생성할 수 있다.
       
       사용법은 FileChannel.open(Path path, OpenOption...) 으로 열기를 하는데
       OpenOption운 READ, CREATE, CREATE_NOW, APPEND, DELETE_ON_CLOSE, WRITE, TRUNCATED_EXISTING 등이 있다.
       그리고 더 이상 파일을 사용하지 않을 경우에는 close()메서드를 호출해서 시스템 자원을 해제해야 한다.
    
    2. 파일 읽기와 쓰기
    
       파일에 바이트데이터를 쓰려면 FileChannel.write() 메서드를 호출한다. 매개값을 ByteBuffer객체를
       전달하는데 파일에 쓰여지는 바이트는 ByteBuffer의 position에서 limit까지 이다.
       position은 0이고 limit가 capacity와 동일하다면 모든 바이트 데이터가 파일에 쓰여지게 된다.
       
       파일로 부터 데이터를 읽기 위해서는 read()메서드를 호출하면 된다. 매개값으로 ByteBuffer가
       주어지고 현재 position에서 부터 읽게 된다. position이 0이면 처음부터 읽게 된다. 
       read()메서드의 리턴값은 파일에서 읽혀진 바이트 수이다. 한번에 읽을 수 있는 최대 바이트 수는
       capacity이기 때문에 최대값은 capacity가 되고 읽을 데이터가 없다면 -1을 리턴한다.
    
    3. 파일 복사
    
       파일 복사를 구현하기 위해서는 ByteBuffer를 중간에 두고 읽기용, 쓰기용 FileChannel을
       번갈아 가면서 수행 된다.
*/

public class FileChannelMain1 {

	public static void main(String[] args) throws Exception {
		
		Path path = Paths.get("c:/Temp/file.txt");
		
		// 1. FileChannel 생성
		FileChannel fc = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		// 2. 파일에 데이터 쓰기
		String data = "안녕하세요.\n";
		data += "동해물과 백두산이\n";
		data += "마르고 닳도록\n";
		data += "하느님이 보우하사\n";
		data += "우리나라 만세\n";
		
		Charset cs = Charset.defaultCharset();
		ByteBuffer buffer = cs.encode(data);
		
		int byteCount = fc.write(buffer);
		System.out.println("file.txt: " + byteCount + " bytes 쓰기 성공");
		
		// 3. 닫기
		fc.close();

	}

}














