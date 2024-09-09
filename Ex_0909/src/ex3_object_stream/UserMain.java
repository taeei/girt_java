package ex3_object_stream;

import java.util.Scanner;

public class UserMain {
	
	public static void main(String[] args) {

		User user = new User();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.새로 등록");
		System.out.println("2.불러 오기");
		System.out.print(">> ");
		int select = sc.nextInt();
		
		switch(select) {
		
		case 1:	// 새로등록
			System.out.print("이름 : ");
			user.setName( sc.next() );
			
			System.out.print("나이 : ");
			user.setAge( sc.nextInt() );
			
			System.out.print("전화 : ");
			user.setTel( sc.next() );
			
			// 유저 정보 저장을 위한 메서드
			InfoWriter iw = new InfoWriter();
			iw.writeInfo(user);
			break;
			
		case 2:	// 불러오기
			System.out.print("전화 : ");
			InfoLoader il = new InfoLoader();
			user = il.loadInfo( sc.next() );	// infoLoader의 user정보를 가져와야함
			
			if(user != null) {
				System.out.println("이름 : " + user.getName());
				System.out.println("나이 : " + user.getAge());
				System.out.println("전화 : " + user.getTel());
			}
			break;
		
		}//switch
		
		
	}//main
}
