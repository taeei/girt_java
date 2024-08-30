package ex6_label;

import java.util.Scanner;

public class Ex4_label_work {
	public static void main(String[] args) {
		
		// 2 ~ 12사이의 n값을 키보드에서 입력 받는다
		// 1부터 6까지의 숫자로 이루어진 두 개의 주사위가 던져졌을 때 
		// 합이 키보드에서 입력받은 n값이 되는 첫번째 경우의 수를 출력
		// --------------------
		// 값 : 13
		// 올바른 범위의 값을 입력하세요 // 맞는 값이 나올 때까지 반복
		
		// 값 : 5
		// (1, 4)
		
		// 값 : 11
		// (5, 6)
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			System.out.println("값 : ");
			n= sc.nextInt();
		
			if( n >= 2 && n <= 12) {
				break;
			}
			
			System.out.println("올바른 범위의 값을 입력하세요");
			
		}//while
		
		outer : for( int i = 1; i <= 6; i++) {
			
			for( int j = 1; j <= 6; j++) {
				
				if( i + j == n) {
					System.out.printf("(%d, %d)", i, j);
					break outer;
				}
				
			}//inner
			
		}//outer
		
//		int a = 1;
//		int b = n - 1;
//	
//		out:for (int i = 1; i <=6; i++) {
//			if (n >=2 || n<=12) {
//				System.out.printf("(%d, %d)", a, b);
//				break;
//			}else {
//				System.out.println("올바른 범위의 값을 입력하세요");
//				break out;
//			}
//		}
		
		
	}//main
}
