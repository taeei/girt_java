package ex3_memo;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class MemoTest {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(700, 300, 250, 400);
		
		Font font = new Font("", Font.PLAIN, 20);
		
		TextField tf = new TextField();
		tf.setBounds(10, 40, 180, 30);
		f.setFont(font);
		
		Button btn = new Button("OK");
		btn.setBounds(195, 40, 40, 30);
		// 버튼 비활성화
		btn.setEnabled(false);
		
		// 여러줄을 입력받는 것이 가능한 TextArea
		TextArea ta = new TextArea(		// 처음 입력되어있을 값, 가로, 세로, 스크롤 생성여부
				"", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 80, 230, 250);
		// ta 비활성화
		ta.setEditable(false);
		
		Button btnSave = new Button("Save");
		btnSave.setBounds(20, 340, 100, 40);
		
		Button btnClose = new Button("Close");
		btnClose.setBounds(130, 340, 100, 40);
		
		f.add(tf);
		f.add(btn);
		f.add(ta);
		f.add(btnSave);
		f.add(btnClose);
		
		// 종료
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// ---- ▲ --- 모양 완성
		
		// TextField에 값이 들어있는 경우에만 OK버튼 활성화
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				if( tf.getText().equals("")) 
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
				
			}
		});
		
		// OK버튼 클릭 감지
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = tf.getText() + "\n";
				ta.append(str);
				
				// TextField의 내용을 비우고 커서를 이동
				tf.setText("");	// tf 비워줌
				tf.requestFocus(); // 커서가 알아서 앞으로 감
			}
		});
		
		// 키보드의 엔터값 감지
		tf.addKeyListener(new KeyAdapter() {
		
			@Override
			public void keyTyped(KeyEvent e) {
				
				if( e.getKeyChar() == KeyEvent.VK_ENTER ) { //엔터 쳤을 때와 ok버튼 누른 결과가 같아야됨
					
					String str = tf.getText() + "\n";
					ta.append(str);
					
					// TextField의 내용을 비우고 커서를 이동
					tf.setText("");	// tf 비워줌
					tf.requestFocus(); // 커서가 알아서 앞으로 감
				}
				
			}
			
		});
		
		// close 버튼 이벤트 감지자
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		// Save 버튼 클릭시 TextArea의 값을 저장
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String message = ta.getText();	// 저장하고싶은 값 가져오기
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
					
					FileDialog fd = new FileDialog(
							f, "저장", FileDialog.SAVE);
						// 부모 프레임, 상단 내용, 저장 버튼
					fd.setVisible(true);
					
					// 저장경로 얻어오기
					String path = fd.getDirectory()	+ fd.getFile();
					System.out.println(path);
					
					// 저장하지 않고 취소 버튼을 누른경우
					if( fd.getFile() == null ) {
						JOptionPane.showMessageDialog(f, "저장하지 않았습니다");
					}
					
					// 스트림으로 message를 기록
					fw = new FileWriter(path);
					bw = new BufferedWriter(fw);
					
					bw.write(message);
					
					bw.flush();
					
					if( fd.getFile() != null ) {
						JOptionPane.showMessageDialog(f, "저장성공");
					}
					
					
				} catch (Exception e2) {
					
				} finally {
					try {
					
						if( bw != null )
							bw.close();
						
						if( fw != null )
							fw.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}					
				}
				
				
			}
		});
		
		f.setResizable(false);
		f.setVisible(true);
		
	}//main
}
