package ex4_layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyLayout {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null); 	// 자동배치 끄기
		//f.setSize(400, 400);
		//f.setLocation(500, 200);
		f.setBounds(500, 200, 400, 400);
		
		Button btnOk = new Button("확인");
		Button btnClose = new Button("닫기");
		
		btnOk.setBounds(70, 90, 100, 50);
		btnClose.setBounds(230, 90, 100, 50);
		
		f.add(btnOk);
		f.add(btnClose);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
		
	}//main
}
