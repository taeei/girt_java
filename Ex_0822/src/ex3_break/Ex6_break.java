package ex3_break;

import java.util.Scanner;

public class Ex6_break {
	public static void main(String[] args) {
		
		// 키보드에서 정수를 입력받고 소수인지를 판단
		// 정수 : 3
		// 3(은)는 소수
		
		// 정수 : 10
		// 10(은)는 안소수
		
		// 정수 : 1
		// 1(은)는 안소수
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int n = sc.nextInt();
		
		
		int i = 2; 
		for(; i < n; i++) {
			if ( n % i == 0 ) {      // n이 1일 때 i != n -> 안소수
				break;
			}
			
			
		}//for
		
		if ( i == n ) {
			System.out.println(n + "은 소수");
		}else {
			System.out.println(n + "은 안소수");
		}
		
		
		
		
		
	}//main
}
