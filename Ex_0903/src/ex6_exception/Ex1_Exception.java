package ex6_exception;

public class Ex1_Exception {
	public static void main(String[] args) {
		
		// 예외처리 구문(try-catch) :
		// 자바에서 프로그램이 실행되는 도중 예외(에러)가 발생하면
		// 그 시점에서 프로그램이 강제적을 종료
		// 이는 올바른 판단하지만, 때로는 예측 가능한 가벼운 오류에 대해서
		// 이를 무시하고 코드를 계속 진행해야 할 때가 있다.
		// 프로그램의 비정상적인 종료를 줄일 수 있도록 하는 기법이 예외처리이다
		
		int n = 0;
		int[] arr = {1, 2, 3};
		
		try{
			
			n = 10 / 2;
			arr[2] = 4;
			
		}catch(ArithmeticException e) {	// Exception : 모든 오류의 부모 클래스 // 오류가 난 시점에서 catch를 들른다.
			// 현재 발생한 오류 정보를 객체e에 담아서 출력
			//e.printStackTrace();	//오류 코드 출력
			System.out.println("정수는 0으로 나눌 수 없습니다");
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("존재하지 않는 배열의 index");
		}finally {
			// 예외 유무에 관계없이 무조건 호출되는 영역
			System.out.println("finally");	
		}
		
		System.out.println("결과 : " + n);
		
		
	}//main

}
