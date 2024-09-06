package ex7_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		Ex1_SingleThread t = new Ex1_SingleThread();
		t.start();		// run()메서드의 내용을 백그라운드에서 실행
		System.out.println("메인스레드 종료");
		
	}//main
}
