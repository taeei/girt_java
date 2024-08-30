package ex10_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		 
		// Up&Down게임 만들기
		//----------------
		// 값 : 30
		// DOWN!!
		// 값 : 15
		// UP!!
		// 값 : 25
		// 3회만에 정답
		// 정답 맞추면 while문 종료
		while(true) {
			
		Scanner sc = new Scanner(System.in);
		int random = new Random().nextInt(50)+1;
		
		Updown u = new Updown();
		
		boolean res = u.check(random);
		
		if(res) {//res ==true
			break;
		}
	
		}

		
	}//main
}

//		int cnt = 1;
//		
//		while(true) {
//			System.out.print("값 : "); // 정답이라는 값을 지속적을 받음
//			int num = sc.nextInt();
//			
//			String s = u.check(num, random);
//			
//			// 정답을 맞추면 현재 while문을 빠져나온다
//			if (s == "Up") {
//				cnt++;
//				System.out.println("UP!!");
//			}else if( s == "Down") {
//				cnt++;
//				System.out.println("DOWN!!");
//			}else if(s == "Same") {
//				break;
//			}
//			 
//		}//while
//		System.out.printf("%d회만에 정답", cnt);