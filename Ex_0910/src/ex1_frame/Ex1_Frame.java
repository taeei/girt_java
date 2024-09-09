package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("나의 첫 프레임");	//import
		frame.setSize(400, 300);
		frame.setLocation(500, 100); // x좌표, y좌표
		
		frame.setBackground( Color.BLUE );	//import
		
		// 현재 프레임을 화면에 띄어주는 메서드
		frame.setVisible(true);
		
		
		
	}//main
	
}
