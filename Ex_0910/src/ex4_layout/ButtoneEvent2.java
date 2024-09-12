package ex4_layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtoneEvent2 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(600, 100, 500, 200);
		
		Button btn1 = new Button("btn one");
		Button btn2 = new Button("btn two");
		Button btn3 = new Button("btn three");
		
		btn1.setBounds(50, 50, 100, 100);
		btn2.setBounds(200, 50, 100, 100);
		btn3.setBounds(350, 50, 100, 100);
		
		// 버튼 세개의 이벤트를 감지하는 감지자
		ActionListener act = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
									// 클릭한 버튼에 쓰여져 있는 내용
				String str = e.getActionCommand();	
				
				switch( str ) {
				case "btn one":
					System.out.println("1번 눌림");
					break;
					
				case "btn two":
					System.out.println("2번 눌림");
					break;
					
				case "btn three":
					System.out.println("3번 눌림");
					break;
				
				
				}//switch
				
			}
		};
		
		btn1.addActionListener(act);
		btn2.addActionListener(act);
		btn3.addActionListener(act);
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
	}//main

}
