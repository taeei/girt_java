package ex1_control_statement;

public class Ex6_switch {
	public static void main(String[] args) {
		
		// switch문의 비교값으로 사용할 수 있는 타입은 
		// 정수형(long제외), 문자, 문자열
		
		String last_name = "박";
		
		switch( last_name ) {
		case "김":
			System.out.println("21%");
			break;     //break 가 없다면 다음 break를 만날 때까지 실행됨. 단, 비교값과 조건값이 일치할 경우 이후
			 
		case "이":
			System.out.println("14%");
			break;
			
		case "박":
			System.out.println("8%");
			break;
			
		case "최":
			System.out.println("4%");
			break;
			
		default:
			System.out.println("데이터가 없습니다");
			break;
			
		}//switch
		
		
		
	}//main
}
