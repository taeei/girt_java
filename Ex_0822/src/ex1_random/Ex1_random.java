package ex1_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {

		// 2 ~ 5 사이의 난수 발생
		// new Random().nextInt(난수의 범위) + 시작수;

		int n1 = new Random().nextInt(4) + 2;
		System.out.println(n1);

		// 1024 ~ 3315 사이의 난수
		// new Random().nextInt(끝 수 - 시작 수 + 1) + 시작수;
		int n2 = new Random().nextInt(33152 - 1024 + 1) + 1024;
		System.out.println(n2);

		System.out.println("-----------------------");

		// 2 ~ 9 사이의 난수를 발생시켜 구구단 출력
		int a = new Random().nextInt(9 - 2 + 1) + 2;

		for (int i = 1; i <= 9; i++) {
//		System.out.println(a + " x "+ i + " = " + (i * a));
			System.out.printf("%d * %d = %d", a, i, (a * i));
		}

	}// main
}
