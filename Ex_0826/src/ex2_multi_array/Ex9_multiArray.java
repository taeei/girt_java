package ex2_multi_array;

import java.util.Scanner;

public class Ex9_multiArray {
	public static void main(String[] args) {
		
		// 학생들의 수학, 영어성적을 등록하는 프로그램이 있다.
		// 몇 명의 정보를 저장할 것인지를 입력 받고
		// 그 수 만 큼 학생들의 이름과 수학, 영어성적을 추가하자
		// ------------------
		// 등록인원 : 2
		// 이름 : hong
		// 수학 : 90
		// 영어 : 87
		// --------
		// 이름 : kim
		// 수학 : 70
		// 영어 : 100
		// -------------------
		// 2명 등록 성공
		// hong 90 87
		// kim 70 100
		// String [][] a = {"hong", "90", "87"}, {"kim", "70", "100"}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록인원 : ");
		int num = sc.nextInt();

		String[] subject = {"이름", "수학", "영어", "사회"};   // 유지보수를 위해 배열 만들기
		
		String[][] a = new String[num][subject.length];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.print(subject[j] + " : ");   //키보드에 입력받기
				a[i][j] = sc.next();
				
			}//inner
			
			System.out.println("-------------------");
			
		}//outer
		
		
	
		
//		for(int i = 0; i < a.length; i++) {
//			System.out.print("이름 : ");
//			a[i][0]= sc.next();
//			System.out.print("수학 : ");
//			a[i][1]  = sc.next();
//			System.out.print("영어 : ");
//			a[i][2] = sc.next();
//					
//			System.out.println("-------------------");
//				
//		}//for
		
		System.out.printf("%d명 등록 성공\n", num);
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
				
			}//inner
			System.out.println();
		}//outer
		
		
		
		
		
		
		
	}//main
		
}
