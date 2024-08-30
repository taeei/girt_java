package ex2_single_for;

public class Ex1_singleFor {
	public static void main(String[] args) {

		// for문 : 특정 명령을 원하는 만큼 반복적을 처리할 대 사용
		// for(초기식; 조건식; 증감식){
		// 조건식이 참일 때 수행되는 영역
		// }

		int n = 0; // '전역변수'

		for (int i = 0; i <= 2; i++) { // for문 안에서 만들어진 변수는 for문 안에서만 사용 가능
			// i는 for문 안에서 생성된 '지역변수' 이므로
			// 현재 for문을 벗어나면 사용이 불가능하다
			System.out.println(i);
		}//for
		
		System.out.println("------------------");
		
		int a = 1;
		for( ; a < 3; a++ ) {    // 초기식 생략됨. for문 밖에서 선언된 a 사용
			System.out.println(a);
		}//for      -> 1, 2
		
		System.out.println(a); //-> 3

	}// main
}
