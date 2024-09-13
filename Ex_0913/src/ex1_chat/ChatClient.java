package ex1_chat;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Frame implements Runnable{
	
	TextArea area;
	TextField input;
	Button send_bt;
	
	// 서버 접속을 위한 객체
	Socket s;
	BufferedReader in;
	PrintWriter out;
	Thread t;	
	
	public ChatClient() {
		
		setLayout(null);	// 부모가 프레임이기에 그냥 사용
		setBounds(250, 100, 400, 500);
		
		area = new TextArea();
		area.setBounds(10, 40, 380, 400);
		
		input = new TextField();
		input.setBounds(10, 450, 300, 30);
		
		send_bt = new Button("send");
		send_bt.setBounds(320, 450, 60, 30);
		
		add(area);	
		add(input);
		add(send_bt);

		// 전송 버튼에 이벤트 감지자 
		send_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 서버에 메세지 전달
				String msg = input.getText().trim();
				if( msg.length() > 0 )
					out.println(msg);
				
				// TextField의 내용을 비워준다
				input.setText("");
			}
		});
		
		
		// x 버튼 감지자
		this.addWindowListener( new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				// 서버에 스레드를 소멸시키기 위해
				// 종료 메세지를 보낸다
				out.println("xx:~!X");
				
			}
			
		});
		
		setVisible(true);
		
		connected(); // 서버 접속
		
		t = new Thread(	this );
		t.start();
				
	}// 생성자
	
	// 서버 접속 메서드
	public void connected() {
		try {
			// 서버 접속
			s = new Socket("192.168.0.12", 3000);
			in = new BufferedReader( 
					new InputStreamReader( s.getInputStream() ) );
			
			out = new PrintWriter( s.getOutputStream(), true );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		while(true) {
		
			try {
				
				String msg = in.readLine();
				if(msg.equals("xx:~!X")) {
					break;
				}
				
				if(msg != null) 
					area.append(msg + "\n");
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}// while
		
		// 열려있는 스트림들 종료
		try {
			
			if(out!=null)
				out.close();
			if(in!=null)
				in.close();
			if(s!=null)
				s.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.exit(0); // 열려있는 스트림 종료
		
	}//run

	
	
}
