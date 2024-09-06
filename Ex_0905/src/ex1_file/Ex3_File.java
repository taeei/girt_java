package ex1_file;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {
		
		String path = "C:/java_kth/util/eclipse";
		File parentFile = new File(path);
		
		if( !parentFile.isFile()) {		
			
			File[] childFile = parentFile.listFiles();	// 파일 클래스로 가져와서
			
			for(int i = 0; i < childFile.length; i++) {
				
				if( childFile[i].isDirectory() ) {	// 실제 폴더들만 출력
					System.out.println(childFile[i].getName());
				}
				
			}//for
			
		}
		
		
	}//main
}
