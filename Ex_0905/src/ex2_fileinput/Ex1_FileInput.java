package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		// ...Stream : 바이트 기반의 스트림(1byte)
		// ...Reader, ...Writer : 캐릭터 기반의 스트림(2byte))
		
		String path = "c:/IOtest/test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		
		if( f.exists() ) {	// file 클래스가 참조하는 path경로가 물리적으로 존재한다면
			
			try {
				fis = new FileInputStream(f);
				
				int code = 0;
				
				// 접근한 path경로에서 더이상 읽을게 없을 때까지(EOF : -1)
				// 반복문을 수행한다
				while( (code = fis.read()) != -1 ) {	
					
					char ch = (char)code;	// code값을 char로 변환해서 ch 저장
					System.out.print(ch);
					
				}//while

				
			} catch (Exception e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				// 사용을 완료한 스트림은 반드시 닫아줘야 한다
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
	}//main
}
