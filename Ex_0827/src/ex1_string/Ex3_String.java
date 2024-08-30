package ex1_string;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {
		
		// 주민번호 : 901122-1234567
		// 당신은 90년 11월 22일에 태어난 남자입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 : ");
		String a = sc.next();
		
		String year = a.substring(0, 2);	// 년
		String month = a.substring(2, 4);	// 월
		String day = a.substring(4, 6);		// 일 
	
		
		String s_gender = a.substring(7, 8);
		int gen = Integer.parseInt(s_gender);
		
		if( gen % 2 == 0) {
			s_gender = "여자";
		}else {
			s_gender = "남자";
		}
		System.out.printf("당신은 %s년 %s월 %s일에 태어난 남자입니다", year, month, day);
		
		
		
		// my 코드
//		char x = a.charAt(7);
//		
//		 
//		if( x == '1' || x == '3') {		// x는 char이기 때문에 '1', '3'으로 작성
//			System.out.printf("당신은 %s년 %s월 %s일에 태어난 남자입니다", year, month, day);
//			
//		} else if( x == '2' || x == '4'){
//			System.out.printf("당신은 %s년 %s월 %s일에 태어난 여자입니다", year, month, day);
//		}
//		
		
		
	}//main
}
