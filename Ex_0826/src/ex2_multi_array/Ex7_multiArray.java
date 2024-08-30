package ex2_multi_array;

public class Ex7_multiArray {
	public static void main(String[] args) {
		
		// 2차원 배열  array 에서 3의 배수를 제외한 값들만 출력
		
		int[][] array = {{1, 2, 3},
			             {4, 5, 6},
			             {7, 8, 9}};
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				if(array[i][j] % 3 != 0){
					System.out.print(array[i][j] + " ");
				}
				
			}//inner
			
			System.out.println();
	
		}//outer
		
	}//main
}
