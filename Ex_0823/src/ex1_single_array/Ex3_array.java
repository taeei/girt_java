package ex1_single_array;

import java.util.Scanner;

public class Ex3_array {
	public static void main(String[] args) {
		
		// 키보드에서 정수를 입력 받는다
		// 입력받은 정수만큼 알파벳을 A부터 순차적으로 출력
		// -----------------------
		// 값 : 6
		// ABCDEF
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값 : ");
		int n = sc.nextInt();
		
		char[] c = new char[n];
		char c2 = 'A';
		
		for( int i = 0; i < c.length; i++) {
			
			//c[i] = (char)('A' + i);
			c[i] = c2++;
			System.out.print(c[i]);
			
		}//for
		
		
		
	}//main
}
