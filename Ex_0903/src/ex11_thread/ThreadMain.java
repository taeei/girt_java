package ex11_thread;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 숫자가 1씩 감소하다가(1초 간격)
		// 0이 되었을 때 스레드를 종료하는 코드를 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		//1
		//MyThread t = new MyThread(n);

		MyThread t = new MyThread();
		//2
		t.setNum(n);
		t.start();
		
		
	}//main
}
