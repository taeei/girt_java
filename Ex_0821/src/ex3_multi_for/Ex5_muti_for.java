package ex3_multi_for;

public class Ex5_muti_for {
	public static void main(String[] args) {

		// * * * * *
		// 1 2 3 4 5
		// * * * * *
		// 1 2 3 4 5
		// * * * * *

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i % 2 == 0) {
					System.out.print(j + " ");
				} else {
					System.out.print("* ");
				}

			} // inner

			System.out.println();

		} // outer

	}// main
}
