package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		// 캐스팅(형변환)
		// 1. promotion casting
		// - 큰 자료형에 작은 자료형이 대입되는 것
		double dd = 100.5;  // 8 byte
		int n = 200;   //4 byte
		dd = n;           // = : 오른쪽값을 왼쪽에 복사한다
		System.out.println(dd);
		
		char c = 'D';  // 2byte
		int i = 100;   // 4byte
		i = c;           //  왼쪽 자료형에 맡게 바뀐다. D -> 68
		System.out.println(i);
	
		
		
	}
}
