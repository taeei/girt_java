package ex5_method_gugudan;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		
		// 단 : 5
		// 5 * 1 = 5
		// 5 * 2 = 10
		// ...
		// 5 * 9 = 45
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		PrintGugu p = new PrintGugu();
		p.print(dan);
		
		
		
		
	}//main
}
