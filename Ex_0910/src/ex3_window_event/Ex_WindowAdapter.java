package ex3_window_event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_WindowAdapter {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setLocation(500, 100);
		
		// 어댑터 클래스를 통해 x버튼 클릭 감지
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
	}//main

}
