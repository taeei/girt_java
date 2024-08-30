package ex2_single_for;

import java.util.Scanner;

public class Ex6_singleFor {
	public static void main(String[] args) {

		// 키보드에서 정수 n1, n2 를 입력받는다
		// n1 부터 n2 까지의 합을 계산하여 결과를 출력
		// 단 n1, n2 의 순서를 다르게 입력받아도 결과는 똑같이 출력
		// -------------------------------
		// 수1 : 3
		// 수2 : 5
		// 결과 : 12

		// 수1 : 5
		// 수2 : 3
		// 결과 : 12

		Scanner sc = new Scanner(System.in);
		System.out.println(" 수1 : ");
		int n1 = sc.nextInt();
		System.out.println(" 수2 : ");
		int n2 = sc.nextInt();

		int sum = 0;
//		if (n1 < n2) {
//			for (int i = n1; i <= n2; i++) {
//				sum+=i;
//			}
//			System.out.println("결과 : " + sum);
//		}else if(n1 > n2) {
//			for (int i = n2; i <= n1; i++) {
//				sum+=i;
//			}
//			System.out.println("결과 : " + sum);
//		}else {
//			System.out.println(n1+n2);
//		}

		
		// 변수 두 개의 값을 교환하는 공식
		if ( n1 > n2) {
			int n3 = n1;     // n3 임시변수를 만들어서 순서 바꾸기
			n1 = n2;
			n2 = n3;
		}
		
		for (int i = n1; i <= n2; i++) {
			sum +=i;
		}
		System.out.println("결과 : " + sum);
		
	}// main
}
