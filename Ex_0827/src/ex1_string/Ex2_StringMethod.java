package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		// String클래스의 메서드(함수) 들
		// 메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
		// 반복적으로 사용되는 코드를 줄이기 위해서 반드시 필요
		
		String name = "Hong Gil Dong";
		int index = name.length();
		System.out.println("name의 길이 : " + index);
		
		// indexOf() :  0부터 세서 앞에서부터 'g'의 위치
		index = name.indexOf('g');				System.out.println("첫 문자 g의 위치 : " + index);
		
		index = name.indexOf("Gil");	// -> "Gil"의 위치값
		System.out.println("문장 Gil의 위치 : " + index);
		
		// lastIdexOf() : 맨 뒤에 있는 g의 위치
		index = name.lastIndexOf('g');	
		System.out.println("마지막 문자 g의 위치 : " + index);
		
		// charAt() : 전체 문장에서 숫자 위치의 한 글자를 가져옴
		char c = name.charAt(5);	
		System.out.println("추출한 문자 : " + c);
		
		// substring() : 숫자 위치부터 뒤의 모든 문장을 추출
		String sub = name.substring(5);	
		System.out.println("추출한 문장 : " + sub);
		
		sub = name.substring(5, 10); 	// 원하는 범위 내의 문장 추출
		System.out.println("추출한 문장2 : " + sub);
		
		// equals() :  대소문자를 포함한 모든 값이 일치하는 경우
		// eqealsIgnoreCase() : 대소문자에 상관없이 값이 일치하느 경우
		String fruit = "apple";
		if(fruit.equalsIgnoreCase("Apple")) { 	//eqealsIgnoreCase : 대소문자 상관 없이 비교
			System.out.println("값이 같아요");
		}else {
			System.out.println("값이 달라요");
		}
		
		// trim() : 문자열앞뒤의 의미없는 공백을 제거(중간 공백 제거는 불가능)
		String id = " abc123 ";
		String id_check = id.trim();
		if( id_check.equals("abc123")) {
			System.out.println("로그인 성공");
		}
		
		// Integer.parseInt() 
		// 정수 형태의 문자열을 연산이 가능한 실제 정수로 바꿔주는 메서드
		String number = "10";               // 변경하려는 문자열이 정수타입이여야 한다. 
		int n = Integer.parseInt(number);
		System.out.println(n + 10);
		
		// java에서 boolean, int등의 기본자료형을 쓸 수 있도록 해 주는
		// 부모타입의 클래스를 Wrapper클래스라고 부른다
		// boolean -> Boolean
		// char -> Character
		// int -> Integer
		// short -> Short
		// long -> Long
		// float -> Float
		// double -> Double
		
	}//main
}
