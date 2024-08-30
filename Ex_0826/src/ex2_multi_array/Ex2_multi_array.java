package ex2_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		
//		char[][] alpha1 = new char[2][4];
//		alpha1[0][0] = 'A';
//		alpha1[0][1] = 'B';
//		alpha1[0][2] = 'C';
//		alpha1[0][3] = 'D';
//		
//		alpha1[1][0] = 'E';
//		alpha1[1][1] = 'F';
//		alpha1[1][2] = 'G';
//		alpha1[1][3] = 'H';
		
		char [][] cArr = {{'A', 'B', 'C'},
				          {'D', 'E', 'F'}};
		
		for(int i = 0; i < cArr.length; i++) {   //2회전
			
			for(int j = 0; j < cArr[i].length; j++) {  //3회전

				System.out.print(cArr[i][j] + " ");
				
			}//inner
			
			System.out.println();

		}//outer
		
	}//main
}
