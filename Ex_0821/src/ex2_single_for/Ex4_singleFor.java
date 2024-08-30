package ex2_single_for;

import java.util.Scanner;

public class Ex4_singleFor {
	public static void main(String[] args) {

		// 키보드에서 값을 받고, 입력받은 값에 해당하는 구국단을 출력
		// --------------
		// 값 : 1
		// 2 ~ 9 사이의 값을 입력하세요

		// 값 : 3
		// 3 x 1 = 3
		// ...
		// 3 x 9

		Scanner sc = new Scanner(System.in);
		System.out.println("값: ");
		int n = sc.nextInt();

//		int sum;
		if (2 <= n && n <= 9) { // '2 <= n <= 9' 로 이어서 쓸 수 X
			for (int i = 1; i <= 9; i++) {
//				sum = n * i;
//				System.out.printf("%d x %d = %d\n", n, i, sum);
				System.out.printf("%d x %d = %d\n", n, i, (n*i));
			} // for
		} else {
			System.out.println("2 ~ 9 사이의 값을 입력하세요");
		}

	}// main

}
