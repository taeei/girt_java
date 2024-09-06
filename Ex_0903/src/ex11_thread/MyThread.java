package ex11_thread;

public class MyThread extends Thread {
	
	private int num;
	
	// main에서 변수 가지고 올 때 1
	public void setNum(int num) {
		this.num = num;
	}
	
//	// main에서 변수 가지고 올 때 2
//	public MyThread(int n) {	
//		this.num = n;
//	}

	@Override
	public void run() {
		
		for( int i = num; i >= 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
