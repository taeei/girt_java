package ex6_atm;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		/*
		 * 1. 입 금 2. 출 금 3. 잔액확인 etc.종 료 >> 1 --입 금-- 입금액 : 1000 입금성공 --------- 1. 입 금
		 * 2. 출 금 3. 잔액확인 etc.종 료 >> 3 --잔액확인-- 1000원 ----------
		 */

		Scanner sc = new Scanner(System.in);
		Atm a = new Atm();

		while (true) {
			System.out.println("1. 입   금");
			System.out.println("2. 출   금");
			System.out.println("3. 잔액확인");
			System.out.println("etc.종  료");
			System.out.print(">> ");
			int n = sc.nextInt();

			switch (n) {
			case 1:
				a.in();
				break;
			case 2:
				a.out();
				break;
			case 3:
				a.left();

			default:
				break;
			}//switch

		}//while

	}// main

}
