package ex8_work;

public class Work {
	
	private String result = "";
	
	public void printOdd( String s ) {
		
		//if 문 없는 코드
		for(int i = 0; i < s.length(); i +=2) {		
			char ch = s.charAt(i);
			System.out.print(ch);
		}
		
//		for(int i = 0; i < s.length(); i++) {
//			if( i % 2 ==0 ) {
//				result += s.charAt(i);
//			}
//		}//for
//		System.out.println("결과 : " + result);
	}

}
