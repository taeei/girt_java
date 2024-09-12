package ex1_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Choice {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 200, 500, 500);
		
		Choice location = new Choice();
		location.add("서울");
		location.add("경기");
		location.add("인천");
		location.add("부산");
		
		Font font = new Font("", Font.PLAIN, 15);
		location.setBounds(100, 100, 200, 0);
		location.setFont(font);
	
		
		Label res_label = new Label("서울");
		res_label.setBounds(100, 200, 150, 100);
		
		location.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// location.getSelectedItem();
				String s = (String)e.getItem();
				res_label.setText(s);	// 선택한 내용에 따라 레이블 내용이 바뀜
				
				}
		});
		
		f.add(location);
		f.add(res_label);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
		
	}//main
}
