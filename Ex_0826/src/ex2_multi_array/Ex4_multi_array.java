package ex2_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {
		
		int[][] num = new int[2][]; 	// 작은방 갯수 미리 지정 안할 때
		num[0] = new int[3]; 	// 큰 0번방의 갯수 지정
		num[1] = new int[2];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		
		num[1][0] = 40;
		num[1][1] = 50;
		
		for(int i = 0; i < num.length; i++) {
			
			for(int j = 0; j < num[i].length; j++) {
				
				System.out.print(num[i][j] + " ");
			
				
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
