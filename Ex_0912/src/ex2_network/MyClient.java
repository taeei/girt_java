package ex2_network;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		String msg = sc.nextLine(); // 띄어쓰기 포함한 값 가져오기
		
		if( msg.trim().length() > 0	) {
			
			Socket s = null;
			
			try {
				// 서버 접속
				s = new Socket("192.168.0.12", 3000);
				
				// 문자열 msg를 서버로 보내기 위한 스트림 준비
				PrintWriter out = new PrintWriter( s.getOutputStream() );
				
				// 서버로 문자열 보내기
				out.write(msg);
				
				out.flush();
			
				if(out != null)
					out.close();
				
				if(s != null)
					s.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}//main
}
