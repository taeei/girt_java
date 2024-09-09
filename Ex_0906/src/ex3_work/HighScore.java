package ex3_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HighScore {

	public void outputScore( int playCount ) {
		
		File saveFile = new File("C:/IOtest/save.txt");
		byte[] b_read = new byte [(int)saveFile.length()];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream(saveFile);
			fis.read(b_read);
			String inputText = new String(b_read);
			
			// 읽어온 inputText를 정수로 변환
			int high = Integer.parseInt(inputText);
			
			// 현재 게임플레이 횟수가 최고기록보다 낮으면
			if( playCount < high ) {
				System.out.println("최고기록 달성");
				fos = new FileOutputStream(saveFile); 		// 기록된 최고기록을 덮어쓰기
				//String cnt = "" + playCount;
				// 문자열로 바꿀 때 
				String cnt = String.valueOf(playCount);
				
				// 최고기록 저장
				fos.write(cnt.getBytes());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				if(fos!=null)
					fos.close();
				if(fis!=null)
					fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}
