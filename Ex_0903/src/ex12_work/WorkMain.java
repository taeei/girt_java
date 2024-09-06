package ex12_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		// 1 ~ 100 사이의 난수 두개를 더하는 문제를 출제
		// 답을 입력하여 5문제가 정답처리 될 때 까지 코드를 반복
		// 게임이 끝날 떄 5문제를 모두 맞히는데 몇초가 걸렸는지를 출력(대략)
		// -----------------
		// 23 + 48 =71
		// 정답
		// 100 + 66 = 대기하고 입력 10
		// 오답
		// ....
		// 61 + 51 = 112
		// 정답 (5문제 째 정답이면)
		// 결과 : 24초
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int correct = 0;
		final int FINISH = 5;	// 상수로 지정해서 값 바꿀 때 위에만 바꾸면 편리;
		
		MyThread t = new MyThread();
		t.start();

		while (true) {	
			t.setPin(false);	// 타이머 시작
			
			int num1 = rnd.nextInt(100) + 1;
			int num2 = rnd.nextInt(100) + 1;
			
			System.out.printf("%d + %d", num1, num2);

			System.out.print(" = ");
			int answer = sc.nextInt();

			if (answer == num1 + num2) {
				System.out.println("정답");
				correct++;
			} else {
				System.out.println("오답");
			}

			// 게임 종료 처리
			if ( correct == FINISH ) {
				break;
				
			}
			
		} // while
		

	}// main

}
