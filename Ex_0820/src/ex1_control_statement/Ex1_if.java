package ex1_control_statement;

public class Ex1_if {
	
	public static void main(String[] args) {
		
		// 제어문 : 프로그램의 흐름을 제어한느 문장 
		// 분기문과 반복문으로 나뉜다
		// 분기문 : if, switch
		// 반복문 : for, while
		
		// 단순 if문
		// if( 조건식 ) {
		//    조건식이 참일 떄 실행되는 영역
		//}
		int n = 51;
		//String은 "" 안에 여러 글자(문자열)를 담을 수 있도록 하는 자료형
		//String str = null;
		String str = "";     
		
		if( n == 50 ) {
			str = "n은 50입니다";			
		}
		
		if( n !=50 ) {
			str = "n은 50이 아닙니다";
		}
		
		System.out.println(str);
		
		
	}//main
}
