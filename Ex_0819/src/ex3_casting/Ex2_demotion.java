package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		// 2. demotion casting
		// - 작은 자료형에 큰 자료형이 대입되는 것
		
		char c = 'A';    // 2 byte
		int n = c + 2;   // 4 byte   // c인 A의 아스키코드 : 65 ; 65+2-> 67
		c= (char)n;   // 큰 자료형이 억지로 작은 자료형에 들어갈 때 가만하고 있다는 것을 괄호안에 (char)로 표현
		System.out.println(c);
		
		float f = 5.5F;
		int i = 0;
		i = (int)f;
		System.out.println(i);    // 5.5를 소수점이 없는 int에 넣어야되므로 (int)를 붙여준다
		
	}

}
