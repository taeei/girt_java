package ex2_demon;

public class DemonMain {
	public static void main(String[] args) {
		
		// 데몬스레드 :
		// 다른 스레드의 작업을 돕는 보조 스레드다.
		// 함께 구동중인 메인스레드가 종료될 때, 같이 종료되도록 할 수 있다.
		
		SaveCls r = new SaveCls();
		Thread t = new Thread(r);
		t.setDaemon(true);		
		t.start();
				
		for( int i = 1; i <= 15; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}
