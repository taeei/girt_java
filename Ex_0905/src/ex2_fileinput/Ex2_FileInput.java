package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		String path = "c:/IOtest/test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[(int)f.length()];	//(int)f.length() 만큼 공백 없이 출력 
		
		if( f.exists() ) {
			
			try {
				fis = new FileInputStream(f);
				
				// fis이 읽어온 내용을
				// byte[] 에 1byte 단위로 저장
				fis.read(b_read);
				
				// b_read의 내용을 String문자열로 재조립
				String res = new String(b_read);

				System.out.println(res.trim());	// 확실하게 공백 없애기
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				try {
					if(fis != null) {
						fis.close();
						
					}
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
			
		}
		
		
		
		
	}//main

}
