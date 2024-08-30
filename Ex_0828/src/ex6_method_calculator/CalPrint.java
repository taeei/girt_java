package ex6_method_calculator;

public class CalPrint {

	public void printResult(int n1, int n2, String operator){
		
		int result = 0;
		
		switch(operator) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;
		default:
			System.out.println("올바른 값을 입력하세요");
			break;
		
		}//switch
		System.out.printf("%d %s %d = %d", n1, operator, n2, result);
	}
}
