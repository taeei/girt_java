package ex2_file_writer;

import java.io.File;
import java.io.FileWriter;

public class Ex1_FileWtriter {
	public static void main(String[] args) {
		
		File f = new File("c:/IOtest/fileWriter.txt");
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(f, true);
			String str = "\n두번째 줄";
			fw.write( str );
			fw.write("test");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				
				if( fw != null)
					fw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}//main
}
