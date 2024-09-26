package ex4_work;

public class Ex3_work {
	public static void main(String[] args) {
		
		
		//         *
		//       * * *  
		//     * * * * * 
		//   * * * * * * * 
		// * * * * * * * * * 
		
		
		for(int i = 0 ; i < 5; i++) {
			
			for(int j = 0; j < 5 + i; j++ ) {
				
				if( i + j > 3 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}//inner
			
			System.out.println();
			
		}//outer
		
//		System.out.println("-------------------------------");
		
		for(int i = 3 ; i >=0; i--) {
			
			for(int j = 0; j < 5+i; j++ ) {
				
				if( i + j > 3 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}// main
}
