package ex2_work;

import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {

		// 1 ~ 45사이의 중복되지 않는 난수들을 저장하는 lotto배열을 만들고값을 출력
		// ----------------------
		// 11 7 42 13 9 20

		int[] lotto = new int[6];       

		outer: for (int i = 0; i < lotto.length;) { // 증감식이 없으면 조건식으로 가기 때문에 i++을 아래로

			lotto[i] = new Random().nextInt(45) + 1;        // 1~45사이의 수 랜덤으로 뽑기

			// 중복값 비교
			for (int j = 0; j < i; j++) { // j < i -> 첫 회전 떄는 무조건 중복이기에 for문 실행하지 않게 범위 설정

				if (lotto[i] == lotto[j]) {
					continue outer; // outer의 증감식으로 감
				} // if

			} // inner

			System.out.print(lotto[i] + " ");
			i++;
		} // outer
		
		

//		for (int i = 0; i < lotto.length; i++) {
//			int num = new Random().nextInt(6) + 1;
//			if (lotto[i] != num) {
//				lotto[i] = num;
//				System.out.print(" " + num);
//			} else {
//
//			}
//		} // for

	}// main
}
