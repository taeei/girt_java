package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4_FileInput {
	public static void main(String[] args) {
		
		// test.txt의 내용을 읽어 숫자들의 합만 출력
		// ------------------
		//결과 : 11
		
		String path = "c:/IOtest/test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		
		
		if( f.exists() ) {
			
			try {
				
				fis = new FileInputStream(f);
				
				int code = 0;
				int sum = 0;
				
				while( (code = fis.read()) != -1) {
					// 방법 1
					String s = "" + (char)code;	//한 글자씩 가져와서 배열에 저장
					
					try {
						// 숫자형태 제외하고는 다 오류이기 때문에 sum에 더해지지 않음
						sum += Integer.parseInt(s); 
					} catch (Exception e) {
						// TODO: handle exception
					}
				
				// 방법 2	
//				char ch = (char)code;
//				if(ch >= '0' && ch <='9') {
//					String s = "" + ch;
//					sum += Integer.parseInt(s);
//				}
					
				}//while
				
				System.out.println("결과 : " + sum);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
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
