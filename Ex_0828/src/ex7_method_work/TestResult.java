package ex7_method_work;

public class TestResult {
	
	public void printRes(String q){
		// q = OOXXOXXOOOO
		// 연산 및 최종결과
		
		int cnt = 0; 
		int sum = 0;	// 결과
		for(int i = 0; i < q.length(); i++) {
			if( q.charAt(i) == 'O') {
				cnt++;
			}else {
				cnt = 0;
			}
			sum +=cnt;
			
		}//for
		
		System.out.println("결과 : " + sum);
		
	}

}
