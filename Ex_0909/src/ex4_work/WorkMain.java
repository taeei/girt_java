package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {

		// id, 승, 무, 패 정보를 가지는 클래스를 만든다
		// 가위 바위 보 게임을 한 뒤, 그 결과를 클래스에 세팅하고
		// Object스트림으로 저장 및 로드

		// id : aaa (키보드)
		// 새로운 유저
		// 0승 0무 0패
		// ----------
		// 가위(s) | 바위(r) | 보(p) : s (키보드)
		// 당신이 졌습니다
		// 0승 0무 1패
		// 다시 하시겠습니까? y | n : y (키보드)
		// ------------
		// 가위(s) | 바위(r) | 보(p) : p (키보드)
		// 비겼습니다
		// 0승 1무 1패
		// 다시 하시겠습니까? y | n : n (키보드)
		// 게임 종료

		// aaa -> 0승 1무 1패 기록해놓고

		// id : aaa
		// 로드성공
		// 0승 1무 1패
		// -----------
		// 가위(s) | 바위(r) | 보(p) :

		GameUser user = new GameUser();

		Scanner sc = new Scanner(System.in);

		int win = 0;
		int lose = 0;
		int tie = 0;

		System.out.print("id : ");
		user.setId(sc.next());
		
		// 기록 로드
		ScoreLoader sl = new ScoreLoader();
		user = sl.startLoad( user.getId() ); // 로드가 잘 되면 승무패 정보도 가지고 user에게 줌

		win = user.getWin();	// 있는 아이디면 승무패 정보를 가져와서 시작
		tie = user.getTie();	
		lose = user.getLose();
		
		System.out.printf("%d승 %d무 %d패\n", win, tie, lose);

		w: while (true) {

			// 0가위, 1바위, 2보
			int random = new Random().nextInt(3);

			System.out.print("가위(s) | 바위(r) | 보(p) : ");
			String rsp = sc.next();
			int usercnt = 0;

			if (rsp.equalsIgnoreCase("s")) {
				usercnt = 0;
			} else if (rsp.equalsIgnoreCase("r")) {
				usercnt = 1;
			} else if (rsp.equalsIgnoreCase("p")) {
				usercnt = 2;
			} else {
				System.out.println("다시 입력하세요");
				continue w;
			}

			// 경우의 수
			if (usercnt - random == -2 || // 이긴 경우
					usercnt - random == 1) {
				System.out.println("이겼습니다");
				user.setWin(++win);
			} else if (usercnt - random == 0) { // 비긴 경우
				System.out.println("비겼습니다");
				user.setTie(++tie);
			} else { // 나머지는 진 경우
				System.out.println("졌습니다");
				user.setLose(++lose);
			}

			System.out.printf("%d승 %d무 %d패\n", win, tie, lose);
			
			System.out.print("한번 더? y | n ");
			if( !sc.next().equals("y") ) {
				System.out.println("게임종료");
				break;
			}
			
			System.out.println("-----------------");

		} // while
		
		ScoreWriter sw = new ScoreWriter();
		sw.startWrite(user);

	}// main

}
