package ex1_network;

import java.io.IOException;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("192.168.0.12", 3000);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
