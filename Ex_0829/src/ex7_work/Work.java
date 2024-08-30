package ex7_work;

public class Work {
	
	private String str;

	public boolean check(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch < '0' || ch > '9') {		// 배열의 값을 하나식 볼 때 문자가 들어가 있으면 false를 리턴
				return false;
			}

		}//for
		
		return true;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	

}
