package ex2_while;

import java.util.Random;

public class Ex4_do_while {
	public static void main(String[] args) {

		/*
		 * java, jsp, spring의 시험을 봤다. 각 과목별 점수는랜덤으로 0 ~ 130점이 대입되도록 한다 과목별 점수 검사 로직은
		 * do_while로 작성하되, 한 과목이라도 100점으 넘어가면 0 ~ 100 사이의 값이 나올때까지 재실행 시킬 것 세 과목 모두 0 ~
		 * 100 사이가 되면 최종 점수를 화면에 출력 
		 * ----------------------- 
		 * java : 97
		 * jsp : 100 
		 * spring :57
		 */

//		int java = new Random().nextInt(131) + 0;  // 전역에서 random을 실행하게되면 변수값이 바뀌지 x
//		int jsp = new Random().nextInt(131) + 0; 
//		int spring = new Random().nextInt(131) + 0;

		int java = 0;
		int jsp = 0;
		int spring = 0;
		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			spring = new Random().nextInt(131);

		} while (java > 100 || jsp > 100 || spring > 100);
		System.out.println("java : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("spring : " + spring);

	}// main
}
