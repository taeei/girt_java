package ex2_output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex2_BufferedOutput {
	public static void main(String[] args) {
		
		File f = new File("c:/IOtest/buffOut예제.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(f);
			bos = new BufferedOutputStream(fos);
			
			String str = "bufferedOutput의 예제입니다.\n여러줄도 가능해요";
			bos.write(str.getBytes());
			
			// BufferedOutputStream에서 작업을 완료했을 때
			// flush()를 호출하지 않으면 내용이 물리적으로 기록되지 않는다
			// 보통 flush()는 스트림을 닫을 때(close()) 함께 수행되지만
			// 닫는 순서가 잘못되면 flush()가 수행되지 않을수도 있기 때문에
			// flush()를 close()와 별개로 따로 호출해 주는 것이 안전하다
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				// 사용한 스트림들은 역순으로 닫아줘야 한다!
				if( bos != null)
					bos.close();
				
				if( fos != null)
					fos.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}//main
}
