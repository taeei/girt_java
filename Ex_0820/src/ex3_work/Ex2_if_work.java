
package ex3_work;

import java.util.Scanner;

public class Ex2_if_work {

	public static void main(String[] args) {
		
		// 윤년 구하기
		// 윤년 : 
		// 1. 연도가 4로 나눠 떨어지면 윤년
		// 2. 연수가 100으로 나누어 떨어지는 해는 평년
		//    -> 4년 주기에 포함되어 있어도 100 으로 나눠 떨어지면 평년
		// 3. 100으로 나눠지더라도 400으로 함께 나눠진다면 윤년
		// 4. 다 안나눠떨어지면 평년
		
		// 년도 : 2024
		// "2024년은 윤년입니다" (출력)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 : ");
		int year = sc.nextInt();
	
		//if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )   //
		if( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {    // 400으로 나눠지면 4, 100으로도 나눠지기 떄문에 생략
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}
		
//		if( year % 400 == 0) {
//			System.out.println(year + "년은 윤년입니다.");
//		}else if(year % 100 == 0) {
//			System.out.println(year + "년은 평년입니다.");
//		}else if(year % 4 ==0) {
//			System.out.println(year + "년은 윤년입니다.");
//		}else {
//			System.out.println(year + "년은 평년입니다.");
//		}
		
		
		
		//System.out.println(year + "년은 ");
		
	}//main
}
