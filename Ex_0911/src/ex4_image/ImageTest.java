package ex4_image;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	
	public static void main(String[] args) {
		
		Frame f= new Frame();
		f.setLayout(null);
		f.setBounds(300, 100, 730, 1300);
		
		// 배경으로 사용할 이미지
		ImageIcon img_back = new ImageIcon("img/배경화면.jpg");
		JLabel img_back_label = new JLabel(img_back);
		img_back_label.setBounds(0, 0, 730, 1300);
		
		ImageIcon img_btn = new ImageIcon("img/btn_img1.png");
		JButton img_icon_btn = new JButton(img_btn);
		img_icon_btn.setBounds(250, 150, 200, 200);
		
		// 마우스 오버시 외곽선 제거
		img_icon_btn.setBorderPainted(false);
		
		// 버튼 배경을 투명
		img_icon_btn.setContentAreaFilled(false);
		
		f.add(img_icon_btn);
		f.add(img_back_label);
		
		
		// 종료
				f.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
		
		f.setVisible(true);
		
	}//main
}
