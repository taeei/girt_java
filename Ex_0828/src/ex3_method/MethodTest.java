package ex3_method;

public class MethodTest {

	public int test2( int n ) {
		n++;
		System.out.println("n : " + n);
		
		// return을 통해 반환값을 가지고 내가 호출되었던 곳으로 돌아간다.
		// 이때 반환혈이 없는 void라면 빈손을 돌아간다
		
		return n;		
		// 반환값이 있으면 return선언. 반환형 타입 맞춰주기
		// 반환값은 무조건 1개
	}
	
	public void test1() {
		System.out.println("안녕하세요");
	}
	
}
