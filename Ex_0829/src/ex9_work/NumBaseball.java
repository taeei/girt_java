package ex9_work;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	public static void main(String[] args) {
		
		// 1 ~ 9사이의 난수 세개를 중복되지 않도록 생성하고
		// 키보드에서 입력받은 값으로 strike, ball, out을 판단
		
		// 숫자는 같은데 자리가 다르면 ball
		
//		591
//		입력 : 123
//		0strike 1ball
//		입력 : 584
//		1strike 0ball
//		입력 : 571
//		2strike 0ball
//		입력 : 591 
//		정답입니다

		Scanner sc = new Scanner(System.in);
		
		int[] com = new int[3];
		
		// 1 ~ 9 사이의 난수 발생 코드 1
		do {			
			for(int i = 0; i <com.length; i++ ) {
				com[i] = new Random().nextInt(9) +1; 
			}//for
			
		}while( com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
		
		System.out.println("" + com[0] + com[1] + com[2]);
		
		
		while(true) {
			
			System.out.println("입력 : ");
			int number = sc.nextInt(); // 123
			
			// 사용자의 입력값을 백, 십, 일의자리로 나눠서 user 배열에 저장
			int[] user = { number/100, number/10%10, number%10 };
			
			int strike = 0;
			int ball = 0;
			
			// 경우의 수 
			for(int i = 0; i < com.length; i++) {
				for(int j = 0; j < com.length; j++) {
					
					if( i == j) {	// 자리도 같고
						if( com[i] == user[j] ) {	// 값도 같으면 strike
							strike++;
						}
						
					}else {			// 자리는 다르고
						if( com[i] == user[j])	// 값이 같으면 ball
							ball++;
					}
					
				}//inner
			}//outer
			
			//정답
			if(strike == com.length) {
				
				System.out.println("정답! - " + com[0] + com[1] + com[2] );
				break; 	//while문 종료
			}else {
				if(strike > 0 || ball > 0) {
					System.out.println(strike + "Strike, " + ball + "Ball");
				}else {
					System.out.println("OUT!!");
				}
				
			}
			
			System.out.println("---------");
			
		}//while
		
		
		
		
		
//		// 1 ~ 9사이의 난수 발생 코드 2 (2 방법 추천)
//		outer : for(int i = 0; i < com.length; ) {
//			
//			com[i] = new Random().nextInt(9)+1;
//			
//			for(int j = 0; j < i; j++) {
//				
//				if(com[i] == com[j]) {
//					continue outer;
//				}
//				
//			}//inner
//			
//			System.out.print(com[i]);
//			i++;
//			
//		}//outer
		
		
	
		
			
	}// main
}
