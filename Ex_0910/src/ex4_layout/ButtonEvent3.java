package ex4_layout;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonEvent3  {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 200, 500, 500);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new PopupClass();
				
			}
		});	
				
		f.setVisible(true);
		
//		Frame f1 = new Frame();
//		f1.setLayout(null);
//		f1.setBounds(500, 200, 500, 500);
//		
//		Frame f2 = new Frame();
//		f2.setLayout(null);
//		f2.setBounds(500, 200, 400, 400);
//		
//		Button btn1 = new Button("YES");
//		Button btn2 = new Button("NO");
//		
//		btn1.setBounds(75, 50, 100, 100);
//		btn2.setBounds(225, 50, 100, 100);
//		
//		ActionListener act = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				String str = e.getActionCommand();
//				
//				switch( str ) {
//				case "YES":
//					f2.dispose();
//					break;
//					
//				case "NO":
//					break;
//					
//				}//switch
//				
//			}
//		};
//		
//		btn1.addActionListener(act);
//		btn2.addActionListener(act);
//		
//		f2.add(btn1);
//		f2.add(btn2);
//		
//		f1.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				f2.setVisible(true);
//				
//			}
//		});
//
//		
//		f1.setVisible(true);
		
	}//main
}
