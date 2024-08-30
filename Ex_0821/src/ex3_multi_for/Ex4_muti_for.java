package ex3_multi_for;

public class Ex4_muti_for {
	public static void main(String[] args) {
		
		// A B C D
		// E F G H 
		// I J K L
		// 이중 for문
		
		char a = 'A';
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <= 4; j++ ) {
				System.out.printf("%c ", a++);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
