package ex9_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("메인스레드" + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}//for
		
	}//main
}
