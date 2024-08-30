package ex1_overloading;

public class OverloadTest {
	
	// 메서드 오버로드
	// 오버로드란 메서드의 '중복정의'라고 하며, 하나의 클래스에서 같으 이름을 가진
	// 함수가 여러개 만들어 지는 것을 말한다
	// -----------
	// 오버로드로 인정되는 경우
	// 1) 인자의 갯수가 다를 때
	// 2) 인자의 타입이 다를 때
	// 3) 인자의 객수가 같아도 순서가 다를 때
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	}

	public void result( int n ) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void result( char c ) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	public void result( String s, int n ) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}
	
	public void result( int n, String s ) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
}
