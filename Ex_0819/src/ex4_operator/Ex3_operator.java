package ex4_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		
		// 논리연산자
		// 비교 연산자를 통한 연산이 두 개 이상  필요할 때 사용
		int age = 30;
		int limit = 35;
		
		// &&(and) 연산자
		// && 연산은 앞쪽의 연산이 거짓이라면 뒤쪽 연산을 수행하지 앟고 건더뛴다
		// true && true ->true
		// true && false -> false
		// false && true -> false
		// false && false -> false 
		boolean res = limit - age > 5 && (age+=5) > 30;   // 앞 연산이 false이면 뒤 연산 실행하지 x 
		System.out.println("&&연산 : " + res);
		System.out.println(age);                            // age -> 30
		

		// ||(or) 연산자
		// || 연산은 앞의 연산이 참이면 뒤쪽 연상르 수행하지 않고 넘어간다 
		// true || true -> true
		// true || false ->true
		// false || true -> true
		// false || false -> false 
		int i1 = 10;
		int i2 = 20;
		res = (i1 += 10) >= 20 || (i2 += 2) - 10 == 11;
		System.out.println("||연산 : " + res);
		System.out.println(i2);
		
		
		//!(not) 연산자
		// 거짓은 참으로, 참은 거짓으로 바꾸는 연산자
		// 영구적으로 바뀌지 x, 일시적으로 바뀜 
		System.out.println(!res); 
		
		// ! 연산이 사용되고 있는 경우에만 반대값으로 변환되기 때문에
		// !이 없다면 원래값을 유지한다
		System.out.println(res);
		
		// !을 통해 변수의 값을 영구적으로 바꾸는 방법
		res = !res;
		System.out.println(res);
		
		System.out.println("---------------------------");
		
		
		// 증감연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// 선행증감과 후행증감의 차이점을 알아두자!
		int a = 10;
		System.out.println("a : " + ++a);  // 선행
		
		int b = 10; 
		System.out.println("b : " + b++);  // 후행
		System.out.println(b);

		b--;
		++b;
		b++;
		b--;
		--b;
		b++;
		++b;
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("---------------------------");
		
		
		// 삼항(조건) 연산자
		// 하나의 조건을 정의하여 그 조건이 참일 떄와 거짓일 때에 대해
		// 원하는 결과를 얻어내기 위해 사용하는 연산자
		// 참이면 앞, 거짓이면 뒤가 출력됨
		int aa = 10;
		int bb = 15;
		res = ++aa >= bb ? false : true;   // 의미에 상관 x
		System.out.println(res);
		
		aa = 10;
		bb = 20;
		char res2 = (aa += aa) == bb ? 'Y' : 'N';   // 결과의 타입이 같아야 함. ex) false : 'N' X
		System.out.println(res2);
		
		System.out.println("----------------------------");
		
		a = 10;
		b = 12;
		res2 = ++a >= b || a - 2 <= b && b + 1 - b >= 0 && (a += b) - (a % b) > 10 ? 'O' : 'X'; 
		System.out.println(res2);
		
		
		
		
	}//main

}
