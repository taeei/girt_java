package ex6_exception;

import java.util.Scanner;

public class Ex3_Exception {
	public static void main(String[] args) {
		
		// 정수 : 100
		// 결과 : 100
		
		// 정수 : abc
		// abc은(는) 정수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String num = sc.next();
		
		try {
			int n = Integer.parseInt(num);	// String - > int 변형
			System.out.println( "결과 : " + n );
		}catch(Exception e) {
			System.out.println(num + "은(는) 정수가 아닙니다");
		}
	}//main
}
