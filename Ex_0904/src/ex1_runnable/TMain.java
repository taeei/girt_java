package ex1_runnable;

public class TMain {
	public static void main(String[] args) {
		
		MyThread r = new MyThread();	
		Thread t = new Thread(r);
		t.start();
		
	}//main
	
}
