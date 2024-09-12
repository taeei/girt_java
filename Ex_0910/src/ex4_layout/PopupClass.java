package ex4_layout;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopupClass {

	public PopupClass() {
		Frame popup = new Frame();
		popup.setLayout(null);
		popup.setBounds(500, 200, 300, 200);

		Button btnYes = new Button("YES");
		Button btnNo = new Button("NO");

		btnYes.setBounds(50, 70, 70, 50);
		btnNo.setBounds(180, 70, 70, 50);

		// 글꼴, 글자 스타일, 글자크기
		Font font = new Font("", Font.PLAIN, 30);
		Label msg = new Label("정말로 종료??");
		msg.setBounds(20, 30, 200, 50);
		msg.setFont(font);

		popup.add(btnYes);
		popup.add(btnNo);
		popup.add(msg);

		// yes 버튼 클릭시 모든 프레임을 종료
		btnYes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// no 버튼 클릭시 열려있는 popup프레임만 종료
		btnNo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 원하는 프레임만 개별적으로 종료하는 메서드
				popup.dispose();

				// 만들어진 프레임의 크기 고정
				popup.setResizable(false);
			}
		});
		
		popup.setVisible(true);

	}

}
