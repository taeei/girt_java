package ex4_layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonEvent {
	
	// 감지자 안에서 변수 사용하고 싶을 땐, main 밖에서 static으로
	static int num = 0;
	
	public static void main(String[] args) {
			
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 100, 500, 300);
		
		Button btn1 = new Button("im1");
		Button btn2 = new Button("im2");
		
		btn1.setBounds(50, 50, 150, 150);
		btn2.setBounds(300, 50, 150, 150);
		
		// btn1 클릭시 이벤트 처리
		btn1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(++num + "1번 버튼 누름");
			}
		});
		
		// btn2 클릭시 이벤트 처리
		btn2.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("2번 버튼 누름");
			}
		});
		
		f.add(btn1);
		f.add(btn2);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
	}//main
}
