package ex5_class_array;

import java.util.Scanner;

public class VenMain {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Vending ven = new Vending();
		
		System.out.println("금액 : ");
		ven.showCans( sc.nextInt() );
		
		System.out.println(">> ");
		ven.selectCan( sc.next() );
		
		
		
	}//main

}
