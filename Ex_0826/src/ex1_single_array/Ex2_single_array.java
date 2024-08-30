package ex1_single_array;

import java.util.Scanner;

public class Ex2_single_array {
	public static void main(String[] args) {

		// 배열에 깂을 입력해서 저장하고, 홀수와 짝수의 객수를 찾아 출력
		// --------------------
		// 배열의 크기 : 5
		// 정수 : 5
		// 정수 : 3
		// 정수 : 2
		// 정수 : 11
		// 정수 : 20
		// --------
		// 홀수 : 3
		// 짝수 : 2

		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기 : ");
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		int oddCnt = 0;		 // 홀수 갯수를 저장하는 변수
		int evenCnt = 0;	 // 짝수 객수를 저장하는 변수

		for (int i = 0; i < size; i++) {
			System.out.println("정수 : ");
			numbers[i] = sc.nextInt();

		}// for

		System.out.println("--------------");

		// 홀수와 짝수의 객수 세기
		
		// 개선된 roof로 만들기
		// numbers = {5, 6, 7, 8, 9};
		for(int n : numbers) {
			if(n % 2 == 0) {
				evenCnt++;
			}else {
				oddCnt++;
			}
		}
		
		// roof 없이 만들기
//		for (int i = 0; i < numbers.length; i++) {
//
//			if (numbers[i] % 2 == 0) {
//				evenCnt++;
//			} else {
//				oddCnt++;
//			}
//		}//for
		
		
		
		System.out.println("짝수 : " + oddCnt);
		System.out.println("홀수 : " + evenCnt);

	}// main
}
