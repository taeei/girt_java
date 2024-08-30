package ex1_single_array;

public class Ex3_single_array {
	public static void main(String[] args) {
		
		String[] arr = {"홍길동", "김길순", "박길남"};
		for(int i = 0; i < arr.length; i++) {
			System.out.println( arr[i] );
		}
		
		System.out.println("----------------------");
		
		// 개선된 roof
		// 조건식, 증감식이 없어 코드가 매우 간편하나
		// 배열의 각 요소(index)에 대한 세부적인 조회가 불가능
 		for(String s : arr)  {			// arr 배열의 모든 값을 s에 담아준다
			System.out.println(s);
		}
		
		
	}//main
}
