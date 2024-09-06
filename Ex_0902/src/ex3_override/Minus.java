package ex3_override;

public class Minus extends Calculator {

	@Override
	public int getResult(int a, int b) {
		return a - b;
	}
}
