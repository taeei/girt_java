package ex3_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {

		// 다중for문 : for문 안에 for문이 들어가 있는 경우

		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for (int i = 1; i <= 3; i++) { // 행(y)

			for (int j = 1; j <= 5; j++) { // 열(x)

				System.out.print(j + " ");

			} // inner

			System.out.println(); // 개행
			
		} // outer

		System.out.println("-----------------");

		// 3 2 1
		// 3 2 1
		// 3 2 1
		for (int i = 1; i <= 3; i++) {

			for (int j = 3; j >= 1; j--) {

				System.out.print(j + " ");
			} // inner

			System.out.println();

		} // outer

	}// main
}
