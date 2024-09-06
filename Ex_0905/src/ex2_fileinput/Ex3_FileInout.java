package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3_FileInout {
	
	public static void main(String[] args) {
		
		String path = "C:\\java_kth\\work\\Ex_0829\\src\\ex1_method_arguments\\ArgsMain.java";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[(int)f.length()];
		
		System.out.println(f.exists());
		
		if( f.exists() ) {
			
			try {
				fis = new FileInputStream(f);
				
				fis.read(b_read);

				String str = new String(b_read);
				
				System.out.println(str.trim());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				if(fis != null) {
					try {
						fis.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			
			
		}
		
	
	}//main
	
	

}
