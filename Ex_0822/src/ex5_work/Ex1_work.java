package ex5_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		/*
		 사용자가 현재 가지고 있는 돈을 입력받고
		 크림빵, 새우깡, 콜라를 잔돈을 하나도 남기지 않고 구입하는 경우의 수를 출력하시오.
		 단, 구입하지 않는 상품이 있으면 안된다
		 -- 크림빵 : 500원, 새우깡 : 700원, 콜라 ㅣ 400원
		 ------------------------------
		 
		 소지금: 4000
		 크림빵 :1, 새우깡 : 1, 콜라 : 7
		 크림빵 :2, 새우깡 : 2, 콜라 : 4
		 크림빵 :3, 새우깡 : 3, 콜라 : 1
		 크림빵 :5, 새우깡 : 1, 콜라 : 2
		 
		 3중 for문 활용
		 break x
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소지금 : ");
		int money = sc.nextInt();
		System.out.println("소지금 : " + money);
		
		int bread = 500;
		int shrimp = 700;
		int coke = 400;
		
//		money = 500*bread + 700*shrimp + 400*coke;
		
		for( int i = 1; money - i * bread >= 0 ; i++) {
			
			for( int j = 1; money - j * shrimp > 0; j++) {
				
				for( int k = 1; money - k * coke > 0; k ++) {
					
					if ( (bread * i) + (shrimp * j) + (coke * k) == money ) {
						System.out.printf("크림빵 : %d, 새우깡 : %d, 콜라 : %d\n", i, j, k);
					}
				}//inner
			}//middle
		}//outer
		
		
//		for(int i = 1; ; i++) {
//			
//			for(int j = 1; ; j++) {
//				
//				for(int k = 1; ; k++) {
//					
//					(bread*i) + (shrimp*j) + (coke*k) = 4000;
//					
//				}
//				
//				
//			}//inner
//			
//			System.out.println();
//			
//		}//outer
		
	}//main
}
