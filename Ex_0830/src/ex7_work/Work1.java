package ex7_work;

public class Work1 {
	
	// 입력 : aabbcca
	// 결과 : abc
	// abcabca
	//abc
	
	// String = result; //초기화를 해두지 않으면 null값+hi ->nullhi로 입력됨
	// String 값에 조작이 필요하다면 = " "; 초기화 해주기
	
	private String result = "";
	
//	public void getResult(String input) {
//		
//		for(int i = 0; i < input.length(); i++) {
//			
//			if( result.indexOf( input.charAt(i) == -1 ) ) {		//result.indexOf()-> -1 없는 값 출력하면 -1
//				result += input.charAt(i);
//			}
//			
//		}//for
//		
//		System.out.println(result);
//		
//	}


	public void change(String s) {
		
		String result ="";
		result += s.charAt(0);
		
		
		out : for(int i = 1; i < s.length()-1; i++) {
					
			if(s.charAt(0) != s.charAt(i)) {
				for(int j = 0; j <s.length(); j++) {
					if(result.charAt(j) == s.charAt(i)) {
						continue out;
					}else {
						result += s.charAt(i+1);					
					}
				}
				
			
			}else {
				continue;
			}
			
			
		}//for
		
		System.out.println("결과 : "+ result);
	}
	
	

}
