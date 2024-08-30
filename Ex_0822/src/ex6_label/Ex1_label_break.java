package ex6_label;

public class Ex1_label_break {
	public static void main(String[] args) {
		
		// label : break, continue에 이름표를 붙여서 
		// 한 번에 두 개 이상의 반복문을 제어할 수 있도록 하는 기법
		
		out:for( int i =1; i <= 3; i++) {
			
			for( int j = 1; j <= 10; j++) {
				
				if( j % 2 == 0) {
					break out;      // out이라는 이름의 반복문을 나가세요
				}
				
				System.out.println(j+ " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
