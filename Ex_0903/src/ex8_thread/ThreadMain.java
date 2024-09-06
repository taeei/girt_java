package ex8_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		// 인접한 위치에서 호출된 스레드들은 
		// 누가 먼저 실행될지 모른다
		t1.start();
		
		// sleep을 활용해서 thread의 우선순위를 결정할 수는 있다
		try {
			Thread.sleep(1000);		// 강제로 1초 쉬기 // 클래스.메서드() - static메서드
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		
		t2.start();
		
	}//main
}
