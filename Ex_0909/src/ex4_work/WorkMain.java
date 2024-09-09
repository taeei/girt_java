package ex4_work;

import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {
		
		// id, 승, 무, 패 정보를 가지는 클래스를 만든다
		// 가위 바위 보 게임을 한 뒤, 그 결과를 클래스에 세팅하고
		// Object스트림으로 저장 및 로드
		
		// id : aaa		(키보드)
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
		
		GameUser gu = new GameUser();
		
		Scanner sc = new  Scanner(System.in);
		
		
		System.out.print("id : ");
		String id = sc.next();
		
		if(gu.getId().equals(id)) {
			System.out.println("로드성공");
			System.out.printf("%d승 %d무 %d패", gu.getWin(), gu.getTie(), gu.getLose());
		}else {
			gu.setId(id);
			System.out.println("새로운 유저");
		}
	
		
	}//main
	
}
