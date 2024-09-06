package ex3_override;

public class CalMain {
	public static void main(String[] args) {
		
		Plus p = new Plus();
		int res = p.getResult(10, 20);	//30
		System.out.println("Plus: " + res);
		
		Minus m = new Minus();
		res = m.getResult(10, 5);
		System.out.println("Minus: " + res);
		
		
	}//main

}
