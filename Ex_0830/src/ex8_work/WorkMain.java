package ex8_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		// 관광객 수 : 2
		// 1. 이름 : hong
		// 1. 나이 : 20
		// ---------------
		// 2. 이름 : kim
		// 2. 나이 : 22
		//----------------
		// 1. 관광객 정보
		// 2. 목적지 변경
		// etc.종	료
		// >> 1
		// 
		//1. 이름 : hong
		//1. 나이 : 20
		//1. 목적지 : 불국사
		// -----------
		//1. 이름 : kim
		//1. 나이 : 22
		//1. 목적지 : 불국사
		//------------------
		// 1. 관광객 정보
		// 2. 목적지 변경
		// etc.종	료
		// >> 2
		//
		//어디로 변경? : 석굴암
		//------------------
		// 1. 관광객 정보			
		// 2. 목적지 변경
		// etc.종	료
		// >> 1
		//가이드, 관광객, 메인 클래스 static 사용 목적지 바꾸면 모든 사람다 바뀐 채로 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int num = sc.nextInt();
		
		Guest guest = new Guest();
		Guide guide = new Guide();
		
		for(int i = 1; i <=num; i++) {
			System.out.print("1. 이름: ");
//			name[i] += sc.next();
			System.out.print("2. 나이: ");
			guest.guestAge(sc.nextInt());
			System.out.println("---------------");
		}
		
		
		while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("etc. 종   료");
			
			System.out.println(">> ");
			int n = sc.nextInt();
			
			switch(n) {
			
			case 1:			
				guest.show();
				break;
				
			case 2:
				guide.changeP();
				break;
			default:
				break;
				
			}//switch
	
		}//while
		
	}//main

}
