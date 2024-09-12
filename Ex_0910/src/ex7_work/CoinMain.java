package ex7_work;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CoinMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 200, 300, 500);
		
		TextField tf = new TextField(15);
		tf.setBounds(10, 40, 200, 20);
		
		Button btn = new Button("OK");
		btn.setBounds(220, 40, 30, 20);
		
		Label lab1 = new Label("500");
		lab1.setBounds(50, 100, 200, 20);
		
		Label lab2 = new Label("100");
		lab2.setBounds(50, 130, 200, 20);

		Label lab3 = new Label("50");
		lab3.setBounds(50, 160, 200, 20);
	
		Label lab4 = new Label("10");
		lab4.setBounds(50, 190, 200, 20);
		
		// ok버튼에 이벤트 감지자 등록
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				// 동전별 갯수판별을 위해 배열을 생성
				int[] coin = {500, 100, 50, 10};
				
				// tf가 가지고 있는 내용을 가져온다
				int s_money = Integer.parseInt(tf.getText()); // 정수 형태의 값을 int로 바꿈 
				
				for(int i = 0; i < coin.length; i++) {
					
					int res = s_money / coin[i];
					
					if( i == 0 )
						lab1.setText(coin[i] + "won - " + res);
					
					else if( i == 1)
						lab2.setText(coin[i] + "won - " + res);
					
					else if( i == 2)
						lab2.setText(coin[i] + "won - " + res);
					
					else if( i == 3)
						lab2.setText(coin[i] + "won - " + res);
					
					s_money %= coin[i];
					
				}//for
			}
		});
		
		f.add(tf);
		f.add(btn);
		f.add(lab1);
		f.add(lab2);
		f.add(lab3);
		f.add(lab4);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
	}//main
}
