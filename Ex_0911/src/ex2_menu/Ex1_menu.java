package ex2_menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_menu {

	public static void main(String[] args) {
		
		Frame f = new Frame("메뉴연습");
		f.setBounds(500, 200, 300, 500);
		
		// 프레임에 붙일 메뉴 객체 생성
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("new");
		MenuItem miOpen = new MenuItem("open");
		MenuItem miSave = new MenuItem("save");
		
		Menu mWindow = new Menu("Window");
		MenuItem miWin  = new MenuItem("new window");
	
		Menu miEditor  = new Menu("editor");
		MenuItem miToggle = new MenuItem("toggle");
		MenuItem miClone = new MenuItem("clone");
		
		// Window - editor의 하위메뉴 추가
		miEditor.add(miToggle);
		miEditor.add(miClone);
		
		// File 메뉴에 하위메뉴를 추가
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		
		// Window 메뉴에 하위메뉴를 추가
		mWindow.add(miWin);
		mWindow.add(miEditor);
		
		// 메뉴바에 메뉴를 추가
		mb.add(mFile);
		mb.add(mWindow);
		
		// 프레임에 메뉴바 추가
		f.setMenuBar(mb);
		
		// miToggle메뉴에 감지자 추가
		miToggle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("토글메뉴 클릭");
				
			}
		});
		
		// 메뉴에 이벤트 감지자 추가
		miWin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("new window menu click!");
				
			}
		});
		
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
