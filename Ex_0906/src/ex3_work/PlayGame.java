package ex3_work;

import java.util.Scanner;

public class PlayGame {

	// 정답
	
	Scanner sc = new Scanner(System.in);
	
	char[] star;	// 별이 찍히는 배열
	int playCount = 0;	// 몇 번만에 정답을 맞추는지 세는 변수
	boolean check = false; // 입력한 값과 일치하는지 확인하는 boolean 값
	
	// 게임이 진행중임을 확인하는 변수
	boolean isPlaying = false;	
		
	public int play( String word ) {	// 랜덤으로 메인에서 단어를 가지고 옴
		
		star = new char[word.length()];	// 랜덤으로 가져온 단어의 길이 = star 배열의 길이
		
		for(int i = 0; i < star.length; i++) {
			star[i] = '☆';					// 단어 수 만큼 별 출력
		}//for
		
		label : while(true) {
			
			playCount++;		// 게임 횟수 카운트
			
			System.out.print("word : ");
			for(int i = 0; i < star.length; i++) { 
				System.out.print(star[i]);
			}								// 별표시만 보이게 출력
			System.out.print(">> ");
			
			// 키보드에서 값을 입력받는다
			String in = sc.next();
			char ch = in.charAt(0); // String -> char
			
			if( ch < 'a' || ch > 'z' || in.length()	> 1 ) {		// 한글자 소문자가 아니라면
				System.out.println("한 글자의 영 소문자만 입력하세요");
				continue;										// while문 다시 시작
			}
			
			check = false;
			isPlaying = false;
			
			for(int i = 0; i < word.length(); i++) {
				
				// 중복값 입력 여부
				if( star[i] == ch ) {
					System.out.println(ch + "은(는) 이미 입력한 문자입니다");
					continue label;
				}
				
				// 일치하는 단어 확인
				if( ch == word.charAt(i) ) {	// 입력한 단어가 정답 단어에 있으면
					star[i] = ch;				// star 배열의 '☆'을 입력한 단어로 바꾼다
					check = true;				// 입력한 값과 일치하니까 true
				}
				
				if( star[i] == '☆' ) {	
					isPlaying = true;	// 별 표시가 있다면 아직 게임중
				}
				
			}//for
			
			if( !check ) {
				System.out.println(ch + "이(가) 포함되어 있지 않습니다");
			}
			
			// 게임 종료 판별
			if( isPlaying = false ) {		// star 배열에 '☆'이 다 없어지면
				System.out.println(word + " 정답 !!");
				System.out.println(playCount + "회 만에 정답");
				break;
			}
			
		}//while
		
		return playCount;
		
	}//play
	
	
}
