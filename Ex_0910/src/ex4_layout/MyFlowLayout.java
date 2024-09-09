package ex4_layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFlowLayout {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		// 안의 객체들을 가로로 정렬시켜주는 레이아웃
		f.setLayout( new FlowLayout());
		f.setSize(400, 300);
		f.setLocation(400, 200);
		
		// 클릭 가능한 버튼 객체
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		Button btn6 = new Button("버튼6");
				
		// 프레임에 버튼 객체를 추가
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		
		// 어댑터 클래스를 통해 x버튼 클릭 감지
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
		
		
	}//main
}
