package ex1_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(400, 100, 500, 250);
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
				
		day.setSize(150, 0); // 높이값은 무의미하다
		day.setLocation(50, 100);
		
		Font font = new Font("", Font.ITALIC, 30);
		day.setFont(font);
		
		// choice객체에 이벤트 감지자 추가
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				String s = day.getSelectedItem();	//선택한 데이터 값 
				System.out.println(s);
			}
		});
				
		f.add(day);
		 
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);
		
		
	}//mian
	
}
