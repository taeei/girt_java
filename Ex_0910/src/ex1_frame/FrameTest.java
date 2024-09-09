package ex1_frame;

import java.awt.Color;

public class FrameTest {
	
	public static void main(String[] args) {
		
		MyFrame fr1 = new MyFrame();
		fr1.setTitle("프레임1");
		fr1.setBackground(Color.YELLOW);
		
		MyFrame fr2 = new MyFrame();	// 똑같은 창 두개
		fr2.setTitle("프레임2");
		fr2.setBackground(Color.GREEN);
		
	}//main

}
