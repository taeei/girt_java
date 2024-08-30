package ex1_string;

import java.util.Scanner;

public class Ex4_String {	
	public static void main(String[] args) {
		
		// 키보드에서 아무 값이나 입력받은 뒤
		// 입력받은 문장에서 소문자 a의 갯수를 판단하시오
		// --------------------
		// 입력 : Aaidsfnaaaaa
		// a의 객수 : 6
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String s = sc.next();
		int cnt = 0;          // a의 갯수 세는 변수
		
		for(int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
			if( s.charAt(i) == 'a') {
				cnt++;
			}
		}//for
		System.out.println("a의 갯수 : "+ cnt);
		
	}//main
}
