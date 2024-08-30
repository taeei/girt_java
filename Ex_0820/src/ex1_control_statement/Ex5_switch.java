package ex1_control_statement;

public class Ex5_switch {
	public static void main(String[] args) {
		
	char ch = 'C';
	
	switch(ch) {
	case 'A':
		System.out.println("90~100");
		break;
		
	case 'B':
		System.out.println("80~89");
		break;
		
	case 'C':
		System.out.println("70~79");
		break;
		
	case'D':
		System.out.println("60~69");
		break;
		
	case'F':
		System.out.println("50~59");
		break;
		
	default:
		System.out.println("올바른 성적을 입력하세요");
		break;
	}//switch
	
		
	}//main

}
