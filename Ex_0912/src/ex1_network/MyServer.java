package ex1_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	
	ServerSocket ss;	// ServerSocket: 관리자
						// socket : 방문자
	
	public MyServer() {
		
		try {
			ss = new ServerSocket(3000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		
		// 무한반복 속에서 언제 접속할지 모르는 클라이언트를 받아야 한다
		while(true) {
			
			try {
				// 접속자를 받는다
				// 접속자가 올 때까지 accept()를 수행하지 않고 기다린다. 들어올 때만 실행
				Socket s = ss.accept();	
			
				// 방금 접속한 클라이언트의 ip주소
				String ip = s.getInetAddress().getHostAddress(); 
				
				System.out.println(ip + "님 안녕?");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}// while
		
	}
	

}
