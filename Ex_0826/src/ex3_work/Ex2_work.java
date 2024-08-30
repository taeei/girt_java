package ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 값 크기의 홀수 마방진 만들기 
		// 시작은 0행 가운데열에서 시작 (1 입력)
		// 홀수 마방진 -> 가로 합 세로 합 같음
		// 위 오른쪽에 다음 숫자/ 숫자가 있으먄 밑에 찍음
		// --------------------
		// 홀수 : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02
		
		Scanner sc = new Scanner(System.in);
		int num = 1; // 시작수
		int x = 0;   // 행
		int y = 0;   // 열
		
		System.out.println("홀수 : "); 
		int size = sc.nextInt();
	
		int[][] arr = new int[size][size];  
		
		x = size / 2;   // 
		
		while(num <= size *size) {          
			arr[y][x] = num;		// 0행 가운데열에 1 입력하고 시작
			
			if( num % size == 0 ) { // 위 오른쪽에 이미 숫자가 잇으면
				y++;
			}else {
				y--;    // 위 오른쪽에 다음 숫자 입력하기
				x++;
				
			}
			
			if( y < 0 ) {        
				y = size - 1;
			}
			
			if( x >= size ) {
				x = 0;
			}
			
			num++;
		}//while
		
		
		
		
//		int median = ((size+1)/2)-1;
//		                             // num1, num2 = 5;
//		array[0][median] = 1;  //array[0][중앙값] = 1;
//		
//		
//		for (int a = 2; a <= size*size; a++) {  // 1~ 25
//			array[size-1][median+1]=a;
//			if( size-1 < 0 || size) {
//				size  ;
//				
//			}else if(median+1 ) {
//				
//			}
//			
//			
//		}
		
		
		for( int i = 0; i < arr.length; i++) {
			
			for( int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j]);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
