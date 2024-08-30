package ex2_multi_array;

public class Ex6_multiArray {
	public static void main(String[] args) {
		
		// 2차원 배열 array에서 5를 초과하는 첫번째 값을 찾아 출력하시오
		// -------------
		// 결과 : 5
		
		int[][] array = {{1, 2, 3},
					     {4, 5, 6},
					     {7, 8, 9}};
		
		out:for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				 
				if( array[i][j] > 5) {
					System.out.println("결과 : " + array[i][j]);
					break out;            // break 만 쓰게 되면 outer로 가기 때문에 6, 7 출력됨
					
				}

			}//inner
			
		}//outer
		
		
	}//main
}
