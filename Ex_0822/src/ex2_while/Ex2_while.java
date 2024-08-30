package ex2_while;

public class Ex2_while {
	public static void main(String[] args) {
		
		// 1 = 1 2 3 4 5
		// 2 = 6 7 8 9 10
		// 3 = 11 12 13 14 15
		// 4 = 16 17 18 19 20
		// 5 = 21 22 23 24 25
		
		int n1 = 1;
		int n2 = 1;
		while(n1 <= 5) { 
			System.out.print(n1++ + " = " );;
			for( int i = 1; i <=5; i++) {
				System.out.print(n2++ + " ");
			}//for
			System.out.println();
			
		}//while
		
	}//main
}
