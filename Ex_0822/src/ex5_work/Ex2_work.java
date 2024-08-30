package ex5_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		//System.out.println("\t");   // tap 누른만큼 띄어짐
		/*
		 02 x 01 = 02	03 x 01 = 03	04 x 01 = 04 ........... 09
		 02 x 02 = 04 
		  ...
		 02 x 09 = 18
		 */
		
		for(int i = 1; i <= 9; i++){
			
			for(int j = 2; j <= 9; j++){
				System.out.printf("%02d x %02d = %02d\t", j, i, (j*i));
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
