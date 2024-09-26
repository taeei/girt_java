package test_k;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PayButtonAction {
	
	static JLabel Bill;
	
	
	public void pay() {
		
		
		Frame f = new Frame("결제할 금액");
		f.setLayout(null);
		f.setBounds(500, 500, 500, 500);
		
		Panel p = new Panel();
		p.setBounds(10, 40, 500, 500);
		p.setLayout(null);
		
		//결제금액을 표시할 라벨
		Bill= new JLabel(String.format("결제하실 금액은 %,d 원 입니다.", TestCode.totalPrice));
		Font billfont = new Font("", Font.BOLD, 20);
		Bill.setFont(billfont);
		Bill.setBounds(80, 100, 400, 50);
		
		
		
		TextField pay_money = new TextField();// 금액을 입력받을 텍스트 필드
		pay_money.setBounds(100,160, 300, 40);
		
		
		JButton btn = new JButton("확인");
		btn.setBounds(220, 300, 100, 50);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//텍스트필드에 있는 값을 정수 형태로 변환
					int fianlbill = Integer.parseInt(pay_money.getText().trim());
					//금액이 일치할 시 주문완료 팝업이 뜸
					if(fianlbill == TestCode.totalPrice) {
						JOptionPane.showMessageDialog(null, "주문이 완료되었습니다.");
						f.dispose();
					//금액이 맞지 않으면 일치 하지 않는 문구 팝업
					}else {
						JOptionPane.showMessageDialog(null, "금액이 일치하지 않습니다.", "오류", JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "올바른 숫자를 입력해주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		
		
		p.add(Bill);
		p.add(btn);
		p.add(pay_money);
		
		f.add(p);
		
		
		f.addWindowListener( new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			};// 컨트롤 + shift + O버튼 누르면 자동 import 
		} );

		
		
		
		f.setVisible(true);
		
	}

}
