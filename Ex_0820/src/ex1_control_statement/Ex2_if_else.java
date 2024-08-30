package ex1_control_statement;

public class Ex2_if_else {
	
	public static void main(String[] args) {
		
		// if-else문 : 하나의 조건에 대해서 참과 거짓을 모두 커버할 수 있는 제어문
		// if( 조건식 ){
		//	 조건식이 참일 떄 실행되는 영역
		//}else{
		//	 조건식이 거짓일 때 실행되는 영역
		//}
		
		int n = 48;
		String ss = "";
		
		if( ++n >= 50 ){ 
			ss = "50이상의 수";
		} else {
			ss = "50미만의 수";
		}
		
		System.out.println(ss);
		System.out.println("--------------------");
		
		// 변수 age에 나이를 대입하고 20세 이상이면
		// 드실만큼 드셨군요, 그렇지 않으면 조금 더 드셔도 되겠어요를 
		// 출력하는 코드(로직)를 작성
		
		int age = 30;
		String s = "";
		
		if ( n >= 20 ) {
			s = "드실만큼 드셨군요";
		}else {
			s = "조금 더 드셔도 되겠어요";
		}
		
		System.out.println(s);
		System.out.println("--------------------");
		
		// 위의 나이 판별 코드를 삼항연산자로 수정
		age = 15;
		String s1 = age >= 20 ? "드실만큼 드셨군요" : "조금 더 드셔도 되겠어요";
		System.out.println(s1);
		
	}//main

}
