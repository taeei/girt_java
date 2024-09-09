package ex3_window_event;

import java.awt.event.WindowEvent;

public class ClosingEvent extends ListnerClass{

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료");
		System.exit(0);
		
	}
	
}
