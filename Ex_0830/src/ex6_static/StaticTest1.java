package ex6_static;

public class StaticTest1 {
	
	int n;
	static String str;
	
	public void inputTest() {
		
		n = 10;
		str = "안녕";
		
		int num = 10;
		
		//일반 메서드에서는 static변수의 선언 및 생성이 불가
		//static int num2 = 20;
	
	}

	public static void inputTest2() {
	
		//static메서드에서는 일반 변수의 사용이 불가
		//n = 20;
		str = "반가웡";
		
		//static메서드에서 만들어진 지역변수는 
		//기본 타입이어도 사용이 가능
		int num = 10;
		
		// static메서드에서 static변수의 선언 및 생성이 불가
		//static int num2 = 20;
	
	}
}
