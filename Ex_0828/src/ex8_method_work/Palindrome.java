package ex8_method_work;

public class Palindrome {

	public String rotate(String ori_str){
		// 원본 문자열을 뒤집어서 저장
		
		String rev_str ="";
		
		for(int i = ori_str.length() -1; i >=0;i--) {
			rev_str += ori_str.charAt(i);
		}
		
		return rev_str;
	}
	
}
