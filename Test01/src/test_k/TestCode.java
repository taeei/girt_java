package test_k;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class TestCode extends JFrame {

	// 버튼 클릭 횟수
	static int mainCnt[] = new int[6];
	static int sideCnt[] = new int[6];
	static String[] mainName = { "가라아게", "밀푀유나베", "술찜", "오코노미야끼", "차돌숙주볶음", "한우타다끼" };
	static String[] sideName = { "계란말이", "고구마튀김", "문어튀김", "숯불꼬치", "타코와사비", "해물떡볶이" };
	static int[] mainPrice = { 23000, 28000, 27000, 24000, 24000, 28000 };
	static int[] sidePrice = { 15000, 13000, 26000, 29000, 29000, 26000 };
	static ImageIcon[] mainIcons = new ImageIcon[6];
	static ImageIcon[] sideIcons = new ImageIcon[6];

	static Frame f = new Frame();
	static Frame bf = new Frame("장바구니");
	static JPanel bp = new JPanel(); // 장바구니 레이블을 추가할 패널
	static JPanel cartPanel = new JPanel(); // 장바구니 레이블을 추가할 패널
	static JLabel[] cartLabels = new JLabel[12]; // 레이블 배열

	public static void main(String[] args) {

		f.setLayout(null);
		f.setBounds(200, 170, 1500, 750); // 티오더 창 크기
		f.setBackground(new Color(13, 13, 13));

		createTopUI();

		// 종료 버튼
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		bf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		f.setVisible(true);
		bf.setVisible(true);
		f.toBack();

	}

	private static void createTopUI() {
		// 상단 UI 구성
		Panel ui_top = new Panel();
		ui_top.setBounds(0, 25, 1000, 10);
		ui_top.setBackground(new Color(242, 5, 5));

		Label top_logo = new Label("KH_Izakaya");
		top_logo.setBounds(40, 40, 200, 50);
		top_logo.setForeground(Color.WHITE);
		top_logo.setFont(new Font("", Font.BOLD, 30));

		Button m_menu = new Button("메인메뉴");
		m_menu.setBounds(30, 100, 150, 50);
		m_menu.setFont(new Font("", Font.BOLD, 20));

		Button s_menu = new Button("사이드메뉴");
		s_menu.setBounds(30, 160, 150, 50);
		s_menu.setFont(new Font("", Font.BOLD, 20));

		Button call = new Button("직원호출");
		call.setBounds(30, 670, 150, 50);
		call.setBackground(new Color(242, 5, 5));
		call.setFont(new Font("", Font.BOLD, 20));

		f.add(ui_top);
		f.add(top_logo);
		f.add(m_menu);
		f.add(s_menu);
		f.add(call);

		// 메뉴 프레임 구성
		createMenuFrame(m_menu, s_menu);
		// 장바구니 프레임 구성
		createCartFrame();
	}

	private static void createMenuFrame(Button m_menu, Button s_menu) {
		JFrame mf = new JFrame("메뉴");
		mf.setBounds(380, 270, 1005, 630);
		mf.setBackground(Color.BLACK);

		JPanel mp = new JPanel();
		mp.setLayout(new GridLayout(0, 3));

		JButton[] main_btn = new JButton[mainName.length];
		JButton[] side_btn = new JButton[sideName.length];

		// 메인 메뉴 버튼 생성
		for (int i = 0; i < mainName.length; i++) {
			main_btn[i] = createMenuButton(mainName[i], mainPrice[i], i, true,
					"C:\\Users\\user1\\Desktop\\메인메뉴\\image" + (i + 1) + ".jpg");
			mp.add(main_btn[i]);
		}

		// 사이드 메뉴 버튼 생성
		for (int i = 0; i < sideName.length; i++) {
			side_btn[i] = createMenuButton(sideName[i], sidePrice[i], i, false,
					"C:\\Users\\user1\\Desktop\\사이드메뉴\\image" + (i + 1) + ".jpg");
			mp.add(side_btn[i]);
		}

		JScrollPane scroll = new JScrollPane(mp);
		mf.add(scroll);
		mf.setVisible(true);

		// 메인 메뉴 버튼 감지자
		m_menu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mf.setVisible(true);
				scroll.getViewport().setViewPosition(new Point(0, 0));
				f.toBack();
				
				
				
			}
		});

		// 사이드 메뉴 버튼 감지자
		s_menu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mf.setVisible(true);
				scroll.getViewport().setViewPosition(new Point(0, 700));
				f.toBack();
				
			}
		});
		
		// 종료버튼
		mf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	// 메뉴 프레임의 버튼들 생성 메서드
	private static JButton createMenuButton(String name, int price, int index, boolean isMain, String imagePath) {
		JButton button = new JButton("<html><center>" + name + "<br>" + price + "원" + "</center></html>",
							new ImageIcon(imagePath));
		button.setBorder(BorderFactory.createEmptyBorder(15, 20, 100, 20));
		button.setBackground(Color.BLACK);
		button.setVerticalTextPosition(JButton.BOTTOM); // 텍스트 위치 가운데
		button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 위치 아래로
		button.setForeground(Color.WHITE);

		if (isMain) {
			mainIcons[index] = new ImageIcon(imagePath);
		} else {
			sideIcons[index] = new ImageIcon(imagePath);
		}

		// 메뉴 버튼들 감지자
		// bf 레이블에 정보 보내기
		button.addActionListener(e -> {
			if (isMain) {
				mainCnt[index]++;
				updateCartLabel(index, true);
			} else {
				sideCnt[index]++;
				updateCartLabel(index, false);
			}
		});
		return button;
	}

	// 장바구니 프레임 생성 메서드
	private static void createCartFrame() {
		bf.setLayout(null);
		bf.setBounds(1375, 270, 320, 630);
		bf.setBackground(Color.BLACK);

		// 장바구니 패널 설정
		cartPanel.setLayout(new BoxLayout(cartPanel, BoxLayout.Y_AXIS)); // 패널 수직으로 생성
		cartPanel.setBounds(15, 115, 290, 425);
		cartPanel.setBackground(Color.WHITE);

		// 초기 레이블 생성
		for (int i = 0; i < cartLabels.length; i++) {
			cartLabels[i] = new JLabel();
			cartLabels[i].setForeground(Color.BLACK);
			cartLabels[i].setFont(new Font("", Font.BOLD, 13));
			cartLabels[i].setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // 레이블 간격 설정
			cartPanel.add(cartLabels[i]);
		}


		JButton btn_pay = new JButton("주문하기");
		btn_pay.setBounds(15, 545, 290, 70);
		btn_pay.setFont(new Font("", Font.BOLD, 15));

		JButton reset = new JButton("장바구니 비우기");
		reset.setBounds(15, 40, 290, 70);
		reset.setFont(new Font("", Font.BOLD, 15));
		
		
		JScrollPane cartScroll = new JScrollPane(cartPanel);
		cartScroll.setBounds(15, 115, 290, 425);
		cartScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		bf.add(cartScroll);
		bf.add(btn_pay);
		bf.add(reset);

		bf.setVisible(true);

		// 장바구니 비우기 버튼 감지자
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearCart();

			}
		});
	}

	
	
	
	// 메뉴 버튼 클릭 시 장바구니 레이블 생성
	private static void updateCartLabel(int index, boolean isMain) {

		// 메인 메뉴인지 사이드 메뉴인지 구분
		String menuName = isMain ? mainName[index] : sideName[index];
		int menuPrice = isMain ? mainPrice[index] : sidePrice[index];
		int count = isMain ? mainCnt[index] : sideCnt[index];

		JLabel cartLabel = cartLabels[index + (isMain ? 0 : mainCnt.length)];
		
		if(count > 0) {
			
			cartLabel.setText(menuName + " : " + menuPrice  + "원" + " : " + count + "개");
			
			// 이미지 사이즈 재정의
			if (isMain) {
				cartLabel.setIcon(resizeImage(mainIcons[index], 70, 70));
			} else {
				cartLabel.setIcon(resizeImage(sideIcons[index], 70, 70));
			}
			
			JButton plus = new JButton("+"); 
			plus.setBounds(120, 50, 25, 25);
			plus.setFont(new Font("", Font.BOLD, 5));
			cartLabel.add(plus);
			
			JButton minus = new JButton("ab");
			minus.setBounds(165, 50, 25, 25);
			cartLabel.add(minus);
			
			// 플러스 버튼 감지자
			plus.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(isMain && mainCnt[index] > 0) {
						mainCnt[index]++;
						updateCartLabel(index, true);
					}else if(!isMain && sideCnt[index] > 0) {
						sideCnt[index]++;
						updateCartLabel(index, false);
					}else {
						updateCartLabel(index, isMain);
					}
					
				}
			});
			
			// 마이너스 버튼 감지자
			minus.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(isMain && mainCnt[index] > 0) {
						mainCnt[index]--;
						updateCartLabel(index, true);
					}else if(!isMain && sideCnt[index] > 0){
						sideCnt[index]--;
						updateCartLabel(index, false);
					}else {
						updateCartLabel(index, isMain);
					}
					
				}
			});
	
		}else {
			cartLabel.setText("");
			cartLabel.setIcon(null);
			cartLabel.setVisible(false);
		}
		
		
	}
	

	// 이미지 사이즈 재정의 메서드
	private static ImageIcon resizeImage(ImageIcon icon, int width, int height) {
		Image img = icon.getImage(); // 이미지 아이콘 배열에서 이미지 가져오기
		Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH); // 사이즈 재정의
		return new ImageIcon(resizedImg); // 바뀐 이미지 이미지 아이콘으로 반환
	}

	// 장바구니 비우기
	private static void clearCart() {
		mainCnt = new int[6]; // 클릭 횟수 초기화
		sideCnt = new int[6]; // 클릭 횟수 초기화
		for (JLabel label : cartLabels) {
			label.setText(""); // 장바구니 글씨 초기화
			label.setIcon(null); // 장바구니 사진 초기화

		}
	}

}
