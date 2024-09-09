package ex3_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class InfoWriter {

	public void writeInfo( User user ) {
		
		//                있는 경로       +  만들고 싶은 전화번호 파일		+  	번호파일 안에 있는 user 정보가 들어있는 파일이름
		String path ="c:/IOtest/User/" + user.getTel().trim() + "/" + "save.sav";
		File dir1 = new File("c:/IOtest/User");
		
		if( !dir1.exists() )	// 없는 폴더 만들기
			dir1.mkdirs();		// 없으면 생성
			
		// dir1은 무조건 있고, user.getTel().trim() 경로까지 있는지 확인
		File dir2 = new File(dir1, user.getTel().trim()); 
		if( !dir2.exists() )
			dir2.mkdirs();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// 모든 경로 생성 완료
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			// User객체를 통째로 기록한다
			oos.writeObject(user);  
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("기록 저장 실패");
		} finally {
			
			try {
				
				if( oos != null)
					oos.close();
				
				if( fos != null)	
					fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}
