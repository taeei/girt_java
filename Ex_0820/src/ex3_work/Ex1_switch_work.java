package ex3_work;

import java.util.Scanner;

public class Ex1_switch_work {
	public static void main(String[] args) {

		// 키보드에서 정수 두 개와 연산자를 입력 받는다
		// 입력받은 두 정수의 연산 결과를 출력
		// ----------------------
		// 수1 : 15 (입력)
		// 수2 : 20 (두번 째 값 입력)
		// 연산자 : +, * ... (입력)
		// 15 + 20 = 35, 15 * 20 = 300 ... int 사용

		Scanner sc = new Scanner(System.in);

		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		System.out.print("연산자 : ");
		String operator = sc.next();

//		int result = 0;
//
//		switch (operator) {
//		case "+":
//			result = n1 + n2;
//			break;
//
//		case "-":
//			result = n1 - n2;
//			break;
//
//		case "*":
//		case "x":
//		case "X":
//			result = n1 * n2;
//			break;
//
//		case "/":
//			result = n1 / n2;
//
//		default:
//			System.out.println("올바른 연산자가 아님");
//			break;
//
//		}// switch
//
//		System.out.println(n1 + " " + operator + " " + n2 + " " + "=" + " " + result);

		
		String result = "";

		switch (operator) {
		case "+":
			result = n1 + " + " + n2 +" = " + (n1 + n2);
			break;

		case "-":
			result = n1 + " - " + n2 +" = " + (n1 - n2);
			break;

		case "*":
		case "x":
		case "X":
			result = n1 + " * " + n2 +" = " + (n1 * n2);
			break;

		case "/":
			result = n1 + " / " + n2 +" = " + (n1 / n2);

		default:
			System.out.println("올바른 연산자가 아님");
			break;

		}// switch
		
		System.out.println(result);
		
	}// main

}
