package ex2_while;

public class Ex3_do_while {
	public static void main(String[] args) {
		
		// do-while문 : 선 처리 후 비교
		// do{
		//	  조건식이 참이 대 실행되는 영역
		// }while( 조건식 );
		
		int a = 5;
		do {
			
			// 조건식에 상관없이 최초 한 번은 반드시 실행
			System.out.println(a);   // 처리 먼저
			a++;
			
		}while( a <= 10);      // 조건이 참이면 다시 실행
		
		
		
		
	}//main
}
