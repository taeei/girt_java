package ex4_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2 
		// 
		// 10 1 2 3 4 5 6 7 8 9
		// 이중 for문 사용
		
		for(int i =1; i <= 10; i++) {
			 
			for(int j =0; j <10; j++)	{
				
				int num = i + j;
				
				if(num > 10) {
					num -=10;
				}
				System.out.print(num +" ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
//		int a=1;
//		
//		for(int i = 1; i <= 10; i++){
//			
//			for(int j =i; j <= i+9; j++ ) { 
//				
//				if( j > 10 ) {
//					System.out.printf("%d ", j-10);    // 11, 12 -> 1, 2
//				}else {
//					System.out.printf("%d ", j);
//				}
//				
//			}//inner
//			
//			System.out.println();
//			
//		}//outer
		
	}//main
}
