package ex12_work;

public class MyThread extends Thread {

	private int time = 0;
	private boolean fin = true;	// 5문제를 맞췄을 때 fin변수가 true로 되어야 함

	public void setPin(boolean a) {
		this.fin = a;
	}

	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			time++;
			if( fin ) {
				break;
			}
		}//while
		
		System.out.println("결과 : " + time + "초");
	}
	
}
