package ex1_string;

import java.util.Scanner;

public class Ex7_String {
	public static void main(String[] args) {
		
		// 입력 : aabab
		// a2b1a1b1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = sc.next();
		
		// 결과 출력용 변수
		String result = "";
		int count = 1;
		
		 for(int i = 1; i < input.length(); i++) {
			 if( input.charAt(i) == input.charAt(i-1) ) {
				 count++;
			 }else {
				result += input.charAt(i-1);   // result = "a"
				result += count;			// result = "a1"
				count = 1;					// count 
			 }
		 }//for
		 
		 // 마지막 문자 처리
		 result += input.charAt( input.length() - 1);  //result = "a2b1a1b"
		 result += count;							   //result = "a2b1a1b1"
		 
		 System.out.println(result);
		
		
		
//		int cnt = 0;
//		int i = 0;
//		int j = 0;
//		
//		out: for(i = 0; i < input.length(); i++) {
//			cnt =0;
//			for(j = i; j < input.length(); j++) {
//				
//				if(input.charAt(i) == input.charAt(j)) {
//					cnt++;
//					
//					
//				}else {
//					
//					System.out.print(input.charAt(i));
//					System.out.print(cnt);
//					continue out ;
//				}
//			}
//		}
		
	}//main
}
