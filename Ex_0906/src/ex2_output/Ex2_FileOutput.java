package ex2_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutput {

	public static void main(String[] args) {
		
		String path = "c:/IOtest/fileOutput예제.txt";
		File f = new File(path);
		FileOutputStream fos = null;
		
		try {
			// fos는 기본적으로 덮어쓰기를 하기 때문에
			// 새로 입력한 내용으로 완전히 교체된다.
			// fos를 생성할 때 true값을 지정해두면, 이어쓰기로 변환되어
			// 기존 내용에 이어지도록 내용이 추가된다.
			fos = new FileOutputStream(f, true);
			String str = "나는 ";
			String str2 = "\n나는 두번째 줄";
			
			// getBytes()를 통해 String타입의 값을 
			// byte[]배열 구조로 변경해야 byte기반의 스트림인
			// FileOutputStream을 통해 실제로 기록할 수 있다.
			fos.write(str.getBytes());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}//main
}
