package ex9_thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		int n = 0;
		while(true) {
			System.out.println(++n + "스레드");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}//while
	}
	
}
