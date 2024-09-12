package ex4_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ScoreLoader {
	
	private GameUser user;

	public GameUser startLoad( String id ) {
		
		user.setId(id); // 아이디까진 가진 상태로 넘어가야된다
		
		String path = "c:/RspScore/" + id + "/userinfo.sav";
		
		File f = new File(path);
		FileInputStream fis = null; 
		ObjectInputStream ois = null;
		
		if( !f.exists() ) { 
			
			try {
				
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				user = (GameUser)ois.readObject();	//user 객체에게 승무패 정보 저장
				
				
			} catch (Exception e) {
				System.out.println("로드 실패");
				e.printStackTrace();
			} finally {
				try {
					if( ois != null ) 
						ois.close();
					if( fis != null)
						fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}else {		// path까지 갈 수 없으면 새로운 유저
			System.out.println("새로운 유저"); // 새로운 유저는 아이디까진만 가진 상태로 넘어가야된다
		}
		
		
		return user;
	}
	
}
