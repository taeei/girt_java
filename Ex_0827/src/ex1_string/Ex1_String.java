package ex1_string;

public class Ex1_String {
	public static void main(String[] args) {
	
		// String클래스의 두 가지 특징
		// 1) 객체 생성 방법 두 가지(암시적, 명시적)   // string만 암시적 가능
		// 2) 한 번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		
		String s1 = "abc";	//암시적 객체 생성
		String s2 = "abc";     // s1과 같은 주소(같은 집) 사용
		String s3 = new String("abc");   //명시적 객체 생성  // s1, s2 와 다른 주소 사용
		
		
		// ==은 객체간 비교에서는 값이 아닌 주소 비교 연산자
		if( s1 == s3 ) {           // 값은 같지만 주소는 다르다
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		// String 값 비교
		// equals() 메서드를 통해 s1, s3의 '값'이 같은지 확인 가능
		if( s1.equals(s3)) {
			System.out.println("값이 같습니다");
		}
		
		String res = "홍길동";
		res += "입니다";
		System.out.println(res);	// 변한값 "홍길동입니다"를 새 주소(heap)를 만들어서 주소를 옮겨감.
		
		String ss1 = "abc";
		String ss2 = "abc";   // ss1과 ss2는 같은 주소
		ss1 = "ab";           // "abc"에서 c를 제외하는 것은 불가능. "ab" 주소를 새로 만들어 옮겨짐
		
		
		System.out.println(ss1 + " / " + ss2);
		
		
	}//main
}
