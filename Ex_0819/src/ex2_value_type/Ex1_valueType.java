package ex2_value_type;

public class Ex1_valueType {
	public static void main(String[] args) {
		/*
		 기본 자료형
		 1. 논리형 : boolean....1byte
		 2. 문자형 : char ..... 2byte 
		 3. 정수형 : byte ..... 1byte (-128 ~ 127)
		 		   short .... 2byte (-32,768 ~ 32,767)
		 		   int ...... 4byte (-21억 ~ 21억)
		 		   long ..... 8byte (-900경 ~ 900경)
		 4. 실수형 : float .... 4.x byte
		 		   double ... 8.x byte
		 */
		
		// 변수 : 자료형과 함께 사용하며 값을 저장하는 공간
		// 변수 선언 규칙
		// -> 자료형 변수명;(선언)  // int abc; 
		// -> 변수명 = 값;(대입)      
		// -> 자료형 변수명 = 값;(초기화)
		
		// 변수명 작성 규칙
		// 1. 숫자로 시작할 수 없다.
		// 2. _를 제외하고 특수문자를 사용할 수 없다.
		// 3. 한글을 사용하지 않는다.
		// 4. 변수의 첫글자는 반드시 소문자로 작성한다.
		
		
		// 논리형
		// 논리형은 true. false중 하나의 값 만을 저잗할 수 있다.
		boolean b1;
		b1 = true;
		b1 = false;
		System.out.println("b1 : " + b1);
		
		// 문자형 : 홀따옴표 안에 딱 한글자만 저장할 수 있다. 두글자x
		char ch ='A';  
		System.out.println("ch : " + ch);
		
		ch = 65 + 1;
		System.out.println("ch : "+ ch);   // ch : B  // 아스키코드 // 정수형 문자를 담는 것은 가능
		
		
		// 정수형
		// 소수점이 없는 정수 데이터를 저장하는 자료형
		//byte b = 128; -> 표현 범위를 벗어나는 값은 담을 수 없다
		int n = 2100000000;
		long lo = 2200000000L;   // L(ㅣ)붙이기 : 컴파일 할 때 너무 빨리 되어서 int로 인식, long 정의를 인지 못하기 때문에 붙임
		long lo2 = 100;
		 
		System.out.println("n : " + n);
		System.out.println("lo : " + lo);
		
		
		// 실수형
		// 소수점을 가지고 있는 값을 저장하는 자료형
		float f = 3.14F;   
		double d = 3.14;
		f = 100;           // 소수점이 없으면 f를 붙여도 되고 안 붙여도 됨
		d = 100;
		System.out.println(f + " / " + d);
		
		
		
		
		
		
		
	}

}








