package ex3_break;

public class Ex3_break {
	public static void main(String[] args) {
		
		// 1 부터 10까지 반복하는 반복문에서
		// 5보다 큰 첫번 째 숫자를 찾아 출력하고, 반복문을 종료
		// ----------
		// 5보다 큰 첫번째 수 : 6
		

		for (int i = 1; i <= 10; i++) {
			if ( i > 5) {
				System.out.println("5보다 큰 첫번쨰 수 : " + i);
				break;
			}
		}
		
		
	}//main
}
