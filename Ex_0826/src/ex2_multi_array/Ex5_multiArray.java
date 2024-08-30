package ex2_multi_array;

public class Ex5_multiArray {
	public static void main(String[] args) {
		
		// 2차원 배열 arr에 담긴 모든 값의 총 합과 평균을 출력
		//-----------------
		// 총 합 : 150
		// 평균 : 12.5
		
		int[][] arr = {{5, 17, 2, 1},
					   {11, 6},
					   {9, 15, 20},
					   {13, 21, 30}};
		
		int sum = 0;        // 총 합 구하는 변수
		float average = 0;  // 평균 구하는 변수
		int cnt = 0;        // 갯수 세는 변수. 평균을 구하기 위해 나눠야 하는 값
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j]; 
				cnt++;           // 갯수 카운트
			}//inner
		}//outer
		
		average = (float)sum /cnt;   // average 와 sum, cnt 타입이 다르기 떄문에 ()
		
		System.out.println("총 합 : " + sum);
		System.out.printf("평균 : %.1f " , average);
		
	}//main
}
