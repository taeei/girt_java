package ex1_single_array;

public class Ex4_array {
	public static void main(String[] args) {
		
		// 배열 arr에 담긴 모든 값의 합을 출력
		// ---------------------
		// 결과 : 62
		
		int[] arr = {15, 7, 20, 3, 17};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i] ;
		}
		System.out.println("결과 : " + sum);
		
		
	}//main
	
}
