package ex7_method_work;

public class WorkMain {
	public static void main(String[] args) {
		
		// question이 OOXXO라면 1 + 2 + 0 + 0 + 1의 결과인 4
		// OXXOOXOOO라면 1 + 0 + 0 + 1 + 2 + 0 + 1 + 2 + 3의 결과인 10
		// OOXXOXXOOOO라면 
		// 1 + 2 + 0 + 0 + 1 + 0 + 0 + 1 + 2 + 3 + 4의 결과인 14
		String question = "OOXXOXXOOO";
		
		TestResult t = new TestResult();
		t.printRes(question);
		
		
	}// main
	
}
