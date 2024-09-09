package ex2_window_event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyEvent implements WindowListener{ // 오른쪽 상단 최소화, 최대화, 종료 버튼이 눌렸을 때를 감지

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 프레임의 x버튼을 눌렀을 때 호출되는 메서드
		System.out.println("x버튼 누름");
		System.exit(0);	// 열려있는 모든 프레임을 종료 (숫자 상관없음 고정값으로 0)
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 됨");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("원래 크기로 돌아옴");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	} 
	
	
	

}
