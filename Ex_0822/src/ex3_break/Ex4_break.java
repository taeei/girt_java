package ex3_break;

import java.util.Scanner;

public class Ex4_break {
	public static void main(String[] args) {

		// 키보드에서 정수를 입력받아
		// 1부터 입력받은 값 까지의 합을 구하되, 합이 20을 넘으면 반복을 종료
		// ----------------
		// 정수 : 10
		// 합이 20을 넘었습니다
		// 총 합 : 21

		// 정수 : 5
		// 총 합 : 15

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println("합이 20을 넘었습니다");
				break;
			}
		}
		System.out.println("총 합: " + sum);

	}// main
}
