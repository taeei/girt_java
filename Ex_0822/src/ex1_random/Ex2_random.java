package ex1_random;

import java.util.Random;

public class Ex2_random {
	public static void main(String[] args) {
		
		// Random 클래스를 이용하여
		// 대문자 A ~ Z 까지의 값 중 하나를 랜덤으로 출력
		// ---------------------------
		// 결과 : G 
		
		// 아스키코드 이용
		int a = new Random().nextInt(90-65+1) + 65;
		System.out.println("결과 : "+ (char)a);
		
		// 
		int alp = new Random().nextInt('Z' - 'A' + 1) + 'A';
		System.out.println("결과 : " +(char)alp);
		
		
		
	}//main
}
