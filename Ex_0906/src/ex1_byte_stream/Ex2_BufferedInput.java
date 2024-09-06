package ex1_byte_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex2_BufferedInput {
	public static void main(String[] args) {
		
		// Buffered스트림을 통해 버퍼링 작업을 수행한다
		// 버퍼링이란, 입출력할 바이트를 버퍼라는 메모리 영역에 바이트 배열 형태로
		// 저장해두는 작업
		// 버퍼영역은 입출력을 위해 마련되어 있는 기억장치의 한 부분으로써
		// 입출력을 위한 자료를 버퍼에 모아두면 전용 공간인 버퍼를 통해 이루어진
		// 작업결과를 더 빠르게 확인할 수 있다.
		
		File f = new File("c:/IOtest/test.txt");
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			bis.read(b_read);
			
			System.out.println( new String(b_read) );
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				//열려있는 모든 스트림을 전부 닫아줘야 한다
				if( bis != null)
					bis.close();
				
				if( fis != null )
					fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}//main

}
