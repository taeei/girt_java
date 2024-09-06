package ex10_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		// 배열 strArr의 값 중 하나를 랜덤으로 가져온가
		// 가져온 값을 무작위로 섞어서 보여주고 정답을 맞히는 코드를 작성
		// ------------
		// 문제 : POEH
		// >> pohe
		// 오답...
		// >> hope
		// 정답!
		
		String[] strArr = {"CHANGE", "HOPE", "VIEW", "APPLE"};
		
		Scramble scramble = new Scramble(strArr); 
		String answer = scramble.getAnswer(); // 정답
		String question = scramble.scrambledWord(); // 정답을 섞은 문제
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문제 : " + question);
		
		while( true ) {
			System.out.print(">> ");
			if( sc.next().equalsIgnoreCase(answer) ) {
				System.out.println("정답!!");
			}else {
				System.out.println("오답..");
			}
			
			
		}//while
		
	}//main
}                                                       
