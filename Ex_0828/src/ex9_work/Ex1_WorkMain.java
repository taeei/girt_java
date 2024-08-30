package ex9_work;

import java.util.Scanner;

public class Ex1_WorkMain {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 값을 암호화 한 결과를 출력(암호표 참고)
		// ----------------
		// 입력 : abc123
		// 결과 : `~!wer  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String str = sc.next();
		
		
		
		Work w = new Work();
		w.ChangeWord(str);
		
		
		
	}//main
}
