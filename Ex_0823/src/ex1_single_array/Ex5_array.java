package ex1_single_array;

public class Ex5_array {
	public static void main(String[] args) {
		
		// 배열 arr에 담긴 값 중 가장 큰 값을 출려
		// ----------------
		// 가장 큰 값 : 19
		// 1, 2, 7, 13, 15, 19
		
		int arr[] = {4, 13, 7, 19, 1, 15}; 
		int max = 4;
		
		
		for (int i = 1; i <arr.length; i++) {
			
			if(arr[i] > max ) {
				max = arr[i];
			}
			
		}//for
		
		System.out.println("가장 큰 값 : "+  max);
		
		
		// 배열 오름차순
//		int a = 4;
//		outer: for( int j = 1; j <arr.length; j++) {
//			if(arr[j] < a) {
//				a = arr[j];
//				System.out.print(a);
//			} 
//		}// for
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j <arr.length; j++) {
				
				if( arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
	
			}//inner
//			System.out.print(arr[i] + " ");  // 
		}//outer
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}//main
}
