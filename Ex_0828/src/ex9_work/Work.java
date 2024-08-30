package ex9_work;

public class Work {
	
	public void ChangeWord(String str){
		
		char alphaCode[] = {'`', '~', '!', '@', '#', '$', '%', '^', '&', 
				'*', '(', ')', '-', '_', '+', '=', '|', '[', ']',
				'{', '}', ';', ':', ',', '.', '/', };
			
			//{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};//ghijklmnopqrstuvwxyz
		char numCode[] = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String result = "";
		
		for( int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);   // str의 0번째 값
			
			if( ch >= 'a' && ch <= 'z') {
				result += alphaCode[ch - 'a'];	
				// ch = 'a' -> 96(아스키코드) / ch - 'a' = 0/ alpha코드 0번쨰값 결과인 ` 추가
			}else if( ch >= '0' && ch <='9') {
				result += numCode[ch - '0'];
			}
			
		}//for
		
		System.out.println("result : " + result);

	}
}
