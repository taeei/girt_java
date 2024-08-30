package ex1_first;

public class Ex1_print {

		public static void main(String[] args) {
			// 주석 : 컴파일 시에 JVM 이 인지하지 못하는
			// 개발자의 메모 작성을 위한 개념
			
			// main 메서드 : 컴파일 시 가장 먼저 호출되는 영역
			System.out.println(100);
			System.out.println("안녕하세요");
			System.out.println(100 + 50);
			System.out.println(100 - 50);
			System.out.println("100 + 50 = " + 150);
			System.out.println("10 + 3 = " + (10 + 3)); // 우선순위 ()가 가장 빠름. 문자열 뒤 연산은 이어 붙이기가 됨 
			System.out.println("안녕" + "하세요");
			System.out.println("반가워" + 10 * 3);  // 반가워30
			System.out.println(1 + 1 + "hi" + 1 +1); // 2ㅗㅑ
		}
}
