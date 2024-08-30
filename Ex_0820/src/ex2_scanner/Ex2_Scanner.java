package ex2_scanner;

import java.util.Scanner;

public class Ex2_Scanner {
	
	public static void main(String[] args) {
		
		// 키보드에서 이름과 나이를 입력받고, 결과릂 출력
		// ------------------------------
		// 이름 : hong
		// 나이 : 20
		// hong 님의 나이는 20살 입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name =  sc.next();
		
		System.out.print("나이 :");
		int age = sc.nextInt();
		
		System.out.println(name + "님의 나이는 " + age + "살 입니다");
		
		
	}//main

}
