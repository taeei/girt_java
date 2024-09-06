package ex1_byte_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex3_BufferedInput {
	public static void main(String[] args) {
		
		// 입력 : a
		// a의 갯수 : 2
		
		// 입력 : 홍
		// 홍의 갯수 : 2
		
		Scanner sc = new Scanner(System.in);
		
		String path = "c:/IOtest/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		int cnt = 0;
		String str = "";

		try {
			
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			fis.read(b_read);
			
			str = new String(b_read);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if( bis != null )
					bis.close();
				
				if( fis != null ) 
					fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}//finally
		
		System.out.print("입력: ");
		String input = sc.next();
		
		//char s = input.charAt(0);	 // 입력한 값을 char로 변환해서
		
		for(int i = 0; i < str.length(); i++) {
			// if(s == str.charAt(i)) 로 비교 가능
			if( (str.charAt(i)+"").equals(input) ) { //char + "" -> string
				cnt++;
			}
		}//for
		System.out.printf("%s의 갯수 : %d", input, cnt);
		
	}//main
}
