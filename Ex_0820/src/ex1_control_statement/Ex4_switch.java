package ex1_control_statement;

public class Ex4_switch {
	public static void main(String[] args) {
		
		// if문과 유사하게 생겼지만, switch문은 ()안에
		// 조건식이 아닌 비교값이 들어가며, 비교값과 조건값을 비교하는 구조
		
		//switch( 비교값 ) {
		//	case 조건값:
		//		비교값과 조건값이 일치할 때 실행되는 영역
		//break;
		//}
		
		// 1. 비교값과 조건값의 타입은 반드시 일치해야 한다
		// 2. 조건값이 중복되어서는 안된다
		
		int n = 5;
		switch( n ) { //비교값
		case 1: // 조건값 
			System.out.println("1.게임하기");
			break;   // 현재 switch문을 통째로 탈출하는 키워드
			
		case 2:
			System.out.println("2.게임설명");
			break;
			
		case 3:
			System.out.println("3.제작자");
			break;
			
		default:
			// 비교값과 조건값이 하나도 일치하지 않을 때 수행되는 영역
			System.out.println("올바른 메뉴를 선택하세요");
			break;
		}//switch
		
	}//main

}
