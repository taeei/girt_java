package ex4_work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ScoreWriter {

	public void startWrite( GameUser user ) {
		
		String path = "c:/RspScore/" + user.getId()	+ "/userinfo.sav";
		
		File f1 = new File("c:/RspScore/");
		
		if( !f1.exists() ) {
			f1.mkdirs();
		}
		
		File f2 = new File(f1, user.getId().trim());
		if( !f2.exists() ) {
			f2.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// 경로 생성
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			// GameUser 객체를 통째로 저장
			oos.writeObject(user);
			
			System.out.println("기록 저장 성공");
			
			oos.flush();
			
		} catch (Exception e) {
			System.out.println("저장실패");
			e.printStackTrace();
		} finally {
			
			try {
				
				if( oos != null )
					oos.close();
				if( fos != null )
					fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}//startWrite
	
}
