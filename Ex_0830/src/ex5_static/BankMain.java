package ex5_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("강남", "02-111-2222");
		Bank b2 = new Bank("홍대", "02-222-2222");
		Bank b3 = new Bank(" 서강대", "02-333-3333");

		// static은 객체생성 없이도(new라는 작업) 클래스명.을 통해 바로 가져다 사용할 수 있다
		Bank.interest = 0.1f;
		b1.myBank();
		b2.myBank();
		b3.myBank();
		
	}//main
}
