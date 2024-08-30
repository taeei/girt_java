package ex1_single_array;

import java.util.Scanner;

public class Ex1_single_array {
	public static void main(String[] args) {
		
		// 학생들의 성적을 입력받고, 평균성적 이상인 학생들의 수와 
		// 평균 이상인 학생들의 번호를 출력
		// ---------------------
		// 학생수 : 3
		// 학생1 : 90
		// 학생2 : 75
		// 학생3 : 84
		// -------------
		// 평균성적 : 83.0
		// --평균성적 이상인 학생들--
		// => 학생1
		// => 학생2
		// 평균 이상인 학생의 수 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 : ");
		int stuCount = sc.nextInt();
		
		int [] grades = new int[stuCount];   
		int sum = 0;
		float average = 0;
		
		// 성적 입력하기
		for(int i = 0; i < stuCount; i ++) {
			
			System.out.printf("학생%d : ", (i+1));
			grades[i] = sc.nextInt();
			
			sum += grades[i];
		}
		
		// 평균
		average = (float)sum / stuCount;  // 타입이 다르기 떄문에 sum이나 stuCount에 (float) 해줘야함
		System.out.printf("평균성적 : %.1f\n", average);
		
		// 평균 이상인 학생정보
		System.out.println("--- 평균 이상의 학생들 ---");
		
		int avgCnt = 0;   // 평균 이상의 학생 수
		for(int i = 0; i < grades.length; i++) {
			
			if ( grades[i] >= average) {
				
				avgCnt++;           // if문에 들어오게 되면 평균 이상의 학생수 +1 
				System.out.printf("=> 학생%d : %d\n", i + 1, grades[i]);
				
			}
	
		 }//for
		
		System.out.println("평균 이상인 학생 수 : "+ avgCnt);
		
//		for(int i = 0; i<grades.length; i++) {
//			sum = grades[i]+=grades[i];
//		}
		
		
//		for(int i ) {
//			for() {
//				
//			}
//		}
	
	}//main
}
