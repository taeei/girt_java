package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		// IO(Input, Output)
		// IO는 입출력 스트림을 의미한다
		// 스트림이란, 데이터를 입출력 하기 위한 통로
		// JVM에서 콘솔의 값을 읽어오면 Input
		// JVM의 값을 콘솔로 내보내려면 Output
		
		String path = "c:/IOtest/test.txt";
		File f = new File(path);	// File클래스는 path까지 접근이 가능하다
		
		// 폴더랑 파일 여부 ㅇ확인
		if( !f.isDirectory() ) {	// = f.isFile()
			System.out.println( f.length() + "byte"); // f의 용량 : 한글 한 글자(2byte), 영어 한 글자(1byte)
		}
		
	}//main
}
