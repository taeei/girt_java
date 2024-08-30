package ex4_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		int n = 0;
		while(n < 10) {
			n++;
			
			if (n % 3 == 0) {
				continue;      // while문 안에서의 continue는 조건식으로 건너뛴다
			}
			
			System.out.println(n);
		
		}//while
		
		System.out.println("------------------------");
		
		n = 0;
		while( n < 5 ) {
			n++;
			
			switch(n) {
			case 1:
				System.err.println(n);
				// switch의 continue는
				//가장 가까운 반복문의 증감식 or 조건식으로 이동
				continue;
				
			}//switch
			
			System.out.println(n);
			
		}//while
		
		
	}//main
}
