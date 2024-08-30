package ex2_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		
		// 키보드에서 직접 값을 입력받기 위해 사용하는 클래스
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		System.out.println("입력받은 값 : " + num);
		
		System.out.println("문자열: ");
		String str = sc.next();
		System.out.println("입력받은 문장 : " + str);
		
	}//main
}
