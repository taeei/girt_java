package ex8_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 문장의 홀수번쨰 문자만 추출하여 결과로 보여주기
		//---------------------
		// 클래스 2개로 (if문 사용하는방법과 사용안하는방법)
		// 입력 : helloworld
		// hlool
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		
		Work w = new Work();
		w.printOdd(sc.next());
		
		
		
	}//main
}
