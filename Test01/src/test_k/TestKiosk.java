package test_k;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class TestKiosk {

	private static int[] clickCounts = new int[9]; // 버튼 클릭 횟수
	private static JFrame frame2; // 두 번째 프레임
	private static JPanel panel; // 레이블을 추가할 패널

	public static void main(String[] args) {
		// 첫 번째 프레임 생성
		JFrame frame1 = new JFrame("Button Click Counter - Frame 1");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(new GridLayout(3, 3)); // 3x3 그리드 레이아웃

		// 버튼 생성 및 배열에 추가
		for (int i = 0; i < 9; i++) {
			JButton button = new JButton("Button " + (i + 1));
			int index = i; // final 변수를 사용하기 위해 index를 별도로 저장

			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭 횟수 증가
					clickCounts[index]++;
					// 레이블 업데이트
					updateLabels();
				}
			});

			frame1.add(button); // 버튼을 프레임에 추가
		}

		frame1.setSize(300, 300);
		frame1.setVisible(true);

		// 두 번째 프레임과 레이블 초기화
		initializeFrame2();
	}

	// 두 번째 프레임과 레이블 초기화
	private static void initializeFrame2() {
		frame2 = new JFrame("Click Counts - Frame 2");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // 세로로 배치

		frame2.add(panel);
		frame2.setSize(200, 300);
		frame2.setVisible(true); // 초기화 후 보이게 함
	}

	// 클릭 횟수 업데이트 메서드
	private static void updateLabels() {
		panel.removeAll(); // 기존 레이블 제거

		for (int i = 0; i < clickCounts.length; i++) {
			if (clickCounts[i] > 0) {
				JLabel label = new JLabel("Button " + (i + 1) + ": " + clickCounts[i]);
				panel.add(label); // 클릭한 버튼에 대한 레이블만 추가
			}
		}

		panel.revalidate(); // 레이아웃 갱신
		panel.repaint(); // 재화면 갱신

	}// main

}
