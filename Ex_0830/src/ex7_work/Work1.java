package ex7_work;

public class Work1 {
	
	// 입력 : aabbcca
	// 결과 : abc
	// abcabca
	//abc
	
	private String s;


	public void change(String s) {
		
		String result ="";
		result += s.charAt(0);
		
		for(int i = 1; i < s.length()-1; i++) {
			for(int j = 0; j <s.length(); j++) {
				if(s.charAt(0) != s.charAt(i)) {
					
				}
			}
		}
		
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
	
	public String getS() {
		return s;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	

}
