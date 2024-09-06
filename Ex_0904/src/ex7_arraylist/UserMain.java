package ex7_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		// id : aaa
		// pw : 1111
		// aaa/ 1111
		// -------------
		// id : bbb
		// pw : 2222
		// aaa / 1111
		// bbb / 2222
		// ---------------
		// id : aaa
		// pw : 3333
		// 중복된 아이디
		
		List<User> list = new ArrayList<User>();
		
		Scanner sc = new Scanner(System.in);
		
		
		w: while(true) {
			// user 객체를 새로 만들어줘야하기 때문에 while문 안으로 쓰기
			User u = new User();
			
			System.out.print("id : ");
			String id = sc.next();
			
			System.out.print("pw : ");
			int pw = sc.nextInt();
			
			// id 중복체크
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId().equals(id)) {
					System.out.println("중복된 아이디");
					System.out.println("----------------");
					continue w;
				}
			}
			
			u.setId(id);
			u.setPw(pw);
			
			list.add(u);
			
			//list에 담긴 모든 user 정보 확인
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getId() + " / " + list.get(i).getPw());
			}
			System.out.println("------------------");
			
		}//while
		
		
	}//main
}
