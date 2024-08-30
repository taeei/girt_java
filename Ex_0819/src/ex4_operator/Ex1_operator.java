package ex4_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		
		/*
		 연산자
		 1. 최고연산자 : . , ()
		 2. 증감연산자 : ++ , --
		 3. 산술연산자 : + , - , * , /, %
		 4. 시프트연산자 : >> , << , >>>
		 5. 비교연산자 : > , < , >= , <= , == , !=
		 6. 비트연산자 : & , |. ^ , ~
		 7. 논리연산자 : && , || , !
		 8. 삼항(조건)연산자 : ?, :
		 9. 대입연산자 : = , *= , /= , %=, += , -=
		 **** 2, 7, 9 중요 ****
		 */
		
		
		// 산술연산자
		// 4칙여산과 나머지 연산자를 나뉜다
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;    
		System.out.println("n1 + n2 : " + n3);
		
		n3 = n1 * n2;
		System.out.println("n1 * n2 : " + n3);
		
		n3 = n1 / n2;     // 몫
		System.out.println("n1 / n2 : " + n3);
	
		n3 = n1 % n2;    // 나머지 
		System.out.println ("n1 % n2 : " +n3);
		
		System.out.println("---------------------");
		
		
		// 대입 연산자
		// 특정 값을 변수에 전달하여 기억시킬 때 사용
		int i1 = 10;
		int i2 = 7;
		i1 += i2;          // i1 = i1 + i2  // i1 = 17;
		System.out.println(i1);
		
		i1 *= 2;           // i1 = i1 * 2  // i1=34;
		System.out.println(i1);
		
		i1 %= 5; 		   // i1 = i1 % 5; 	//i1 = 4;
		System.out.println(i1);
		
		
		
		
		
	
	
	
	}
}
