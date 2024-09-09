package ex3_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InfoLoader {
	
	private User user;

	public User loadInfo(String tel) {
		String path ="c:/IOtest/User/" + tel + "/" + "save.sav";
		
		File f = new File(path);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if( f.exists() ) {	// 불러오기 했을 때 입력한 전화번호가 가져올 경로(path)가 있는지 확인
			
			try {
				
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				// ois.readObject()는 object로 읽어오기 때문에 user에 담기 위해서는 User형태로 캐스팅 해야됨
				user = (User)ois.readObject();	
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					
					if( ois != null)
						ois.close();
					
					if( fis != null)
						fis.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		
		}else {
			System.out.println("가져올 정보가 없습니다");
		}
		
		return user;
		
	}//loadInfo

}
