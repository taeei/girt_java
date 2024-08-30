package ex6_atm;

import java.util.Scanner;

public class Atm {
	
	Scanner sc = new Scanner(System.in);
	
	private int money;
	
	//입금기능
	public void in() {
	
		System.out.print("입금액 : ");
		int inmoney = sc.nextInt();
		
		this.money += inmoney;
		
		System.out.println("입금성공");
		System.out.println("-----------------");
	
	}//in
	
	
	//출금기능
	public void out() {

		System.out.print("출금액 : ");
		int outmoney = sc.nextInt();
		
		if(this.money - outmoney < 0 ) {
			System.out.println("잔액부족");
		}else {
			money -= outmoney;
			System.out.println("출금성공");	
		}
		System.out.println("-----------------");
		
	}//out
	
	
	//잔액확인
	public void left() {
		System.out.println("잔액: " + this.money + "원");
		System.out.println("----------------");
		
	}
}
