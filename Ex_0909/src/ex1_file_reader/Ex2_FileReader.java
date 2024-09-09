package ex1_file_reader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {

	public static void main(String[] args) {
		
		// test.txt의 내용을 읽어서
		// 알파벳 대문자의 갯수와, 소문자의 갯수를  출력
		// -------------------
		// 대문자 : 3
		// 소문자 : 8
		
		File f = new File("c:/IOtest/test.txt");
		FileReader fr = null;
		
		int upper = 0;
		int lower = 0;
		
		try {
			 fr = new FileReader(f);
			 int code = 0;
			 
			 while( (code = fr.read()) != -1 ) {
				 
				 if( code >= 'A' && code <= 'Z') {
					 upper++;
				 }
				 
				 if( code >='a' && code <= 'z') {
					 lower++; 
				 }
				 
			 }//while
			 
			 System.out.println("대문자 : " + upper);
			 System.out.println("소문자 : " + lower);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				if (fr != null)
					fr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	}//main
	
}


