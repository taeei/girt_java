package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex5_FileInput {
	public static void main(String[] args) {
		
		// test.txt의 내용을 읽어서
		// 회문인지 아닌지를 판별
		// -----------------
		// abc은(는) 회문이 아닙니다
		
		String path = "c:/IOtest/test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[(int)f.length()];
	
		String ori = "";
		String  rev = "";
	
		if(f.exists()) {
			
			try {
				fis = new FileInputStream(f);
				
				// fis가 읽어온 내용을 b_read배열에 1byte씩 담는다
				fis.read(b_read);
				
				// byte 배열을 String 타입으로 변환
				ori = new String(b_read);
				
				// 원본을 뒤집어서 저장
				for(int i = ori.length()-1; i >= 0; i--) {
					rev += ori.charAt(i);
				}// for
				
				// 결과 확인
				if(ori.equals(rev)) {
					System.out.println(ori.trim() + "은(는) 회문입니다");
				} else {
					System.out.println(ori.trim() + "은(는) 회문이 아닙니다");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				try {
					if(fis != null) 		// if문이 한 줄일 경우 중괄호 없어도 됨.
						fis.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
	}//main
}
