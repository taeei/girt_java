package ex1_string;

import java.util.Scanner;

public class Ex6_String {
	public static void main(String[] args) {
		
		// 입력 : abcabca
		// 결과 : a3b2c2   
		
	    //입력 : 010-3310-5852
	    //결과 : 0312-232528121
	    //0:3, 1:2, -:2, 3:2, 5:2, 8:1, 2:1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String str = sc.next();
		
		// 모든 알파벳, 특문, 숫자 등에 대응할 수 있도록 255개의 배열을 생성. 아스키코드 255번까지 존재
		int[] charCount = new int[256];
		
		// 입력받은 각 문자의 객수를 카운트
		for(int i = 0; i < str.length(); i++) {
			charCount[ str.charAt(i) ]++; 	// charCount['a'] -> charCount[65]
		}
		
		// 결과 출력
		for(int i = 0; i < charCount.length; i++) {
			if( charCount[i] > 0) { 	// count가 된 값만 출력
				System.out.printf("%c%d", i, charCount[i]);
			}
		}
		
		
	}//main
}
		
//		int cnt = 0;
//		int i = 0;
//		int j = 0;
//		out:for(i = 0; i < str.length(); i++) {
//			cnt = 0;
//			for(j = 0; j < str.length(); j++ ){
//				
//				if( str.charAt(i) == str.charAt(j)){
//					cnt++;
//				}
//			}//inner
//			
//			
//			System.out.print(str.charAt(i)+ ":");
//			System.out.print(cnt + "\t");
//				
//			
//		}//outer
		
		
