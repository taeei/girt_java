package ex1_runnable;

import javax.swing.JFrame;

public class MyThread extends JFrame implements Runnable{	
	// runnable을 사용하면 thread가 구동은 되지만
	// main에서 실행할 때 start메서드를 쓰기 위한 한 줄 더 필요함

	@Override
	public void run() {
		for( int i = 0; i < 10; i ++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("스레드 실행 " + i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//for
		
	}
	
	
}
