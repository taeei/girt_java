package ex5_anonymous;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Anony {
	public static void main(String[] args) {
	
		// 아래와 같이 이름이 없는 형태로
		// 필요할때만 즉석에서 생성되는 구조를 '익명클래스' 라고 한다
		// 익명클래스는 사용된 직후 메모리에서 알아서 삭제된다
		//int n = new Random().nextInt(10);
		//int n2 = new Random().nextInt(10);
		
		// 이름이 있는 형태의 클래스는
		// 필요할 떄마다 이름을 통해(rnd)접근할 수 있다는 장점이 있지만
		// 프로그램이 완전히 종료될때 까지 메모리에서 사라지지 않는다
		Random rnd = new Random();
		int n1 = rnd.nextInt(10);
		int n2 = rnd.nextInt(10);
	
		int number = new Scanner(System.in).nextInt(); // 잘 안씀
		
	}//main	
	
}
