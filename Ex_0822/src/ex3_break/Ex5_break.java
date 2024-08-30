package ex3_break;

import java.util.Scanner;

public class Ex5_break {
	public static void main(String[] args) {
		
		// 키보드에서 정수 두 개를 입력받아, 두 수의 최대공약수 구하기
		// -----------------------
		// 수1 : 10
		// 수2 : 4
		// 최대공약수 : 2
		
		// 수1 : 3
		// 수2 : 7 
		// 최대공약수가 없습니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int n2 = sc.nextInt();
		
		if ( n1 > n2) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;        // 순서에 상관없이 값이 나와야함. n1을 작은 수로 만들기
		}
		
		int i = n1;
		
		for( ; i >= 1; i--) {
			if ( n1 % i == 0 && n2 % i == 0 ) {   // 1 이거나 최대 공약수가 나오면 for문을 나옴
				break;
			}
		}//for
		
		if ( i == 1 ) {
			System.out.println("최대공약수 없음");   // 1이면 최대공약수를 찾지 못하고 1까지 반복
		}else {
			System.out.println("최대공약수 : " + i);    // 최대공약수가 있다면 1까지 가지 X
		}
		
		
		
//		if (n1 > n2) {
//			for ( int i = n1; i > 1; i--) {
//				if(n1 % i == 0 && n2 % i == 0) {
//					System.out.println("최대공약수 : "+ i);
//					break;
//				}
//				
//			}
//		} else if(n1 < n2) {
//			
//			
//		}
		
	}//main
}
