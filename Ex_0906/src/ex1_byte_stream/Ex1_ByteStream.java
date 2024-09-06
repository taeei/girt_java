package ex1_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_ByteStream {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		byte[] read = new byte[100];
		byte[] console = new byte[100];
		
		System.out.print("경로 : ");
		
		try {
			System.in.read( console );	// 
			String path = new String(console).trim();
			
			File f = new File(path);
			fis = new FileInputStream(f);
			
			fis.read(read);
			
			String res = new  String(read);
			
			System.out.println(res);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if( fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//main

}
