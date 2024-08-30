package ex2_multi_array;

import java.util.Scanner;

public class Ex8_multiArray {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 값 보다  큰 첫번쨰 값을 찾아 출력하고
		// 찾아낸 값이 포함된 행을 모두 출력
		// ---------
		// 검색 : 8
		// 8보다 큰 첫번쨰 수 : 9
		// 9 10 11 12
		
		int[][] array = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9, 10, 11, 12},
						 {13, 14, 15, 16}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 : ");
		int n = sc.nextInt();


		out : for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				if ( array[i][j] > n) {
					
					System.out.printf("%d보다 가장 큰 첫번쨰 수 : %d\n", n, array[i][j]);
					
					// 해당 행의 모든 값 출력
					for( int k = 0; k < array[i].length; k++) {    
						System.out.print(array[i][k] + " ");
					}
					break out;
				}
				
			}//inner
			
		}//outer
	
	}//main
}
