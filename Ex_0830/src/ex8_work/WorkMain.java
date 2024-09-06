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
		int n = sc.nextInt();
		Guide guide = new Guide(n);
		
		Guest guest = new Guest();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%d. 이름: ", i+1);
			guide.guest[i].setName( sc.next() );
			
			System.out.printf("%d. 나이: ", i+1);
			guide.guest[i].setAge( sc.nextInt() );
			System.out.println("---------------");
		}
		
		
		outer: while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("etc. 종   료");
			System.out.println(">> ");
			
			switch(sc.nextInt()) {
			case 1:			
				for(int i = 0; i < n; i++) {
					System.out.printf(
							"%d.이름 : %s\n", i+1, guide.guest[i].getName());
					
					System.out.printf(
							"%d.나이 : %s\n", i+1, guide.guest[i].getAge());
					
					System.out.printf(
							"%d. 목적지 %s\n", i+1, guide.guest[i].getPoint());
					
					System.out.println("-----------");
				}
				break;
				
			case 2:
				System.out.println("목적지 변경 : ");
				Guide.point = sc.next();
				System.out.println("----------------------");
					
				break;
				
			default:
				System.out.println("여행종료");
				break outer;
				
			}//switch
	
		}//while
		
	}//main

}
