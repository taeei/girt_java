package ex8_work;

import java.util.Scanner;

public class ActorMain {
	public static void main(String[] args) {
		
		// 배우검색 : lee
		// [lee]
		// 광해
		// 레드
		// 지아이조
		
		// 배우검색 : mmm
		// 해당 배우가 존재하지 않습니다
		
		String[][] actor = {{"[song]", "박쥐", "괴물", "관상"},
							{"[ma]", "범죄도시", "더파이브", "챔피얼"},
							{"[lee]", "광해", "레드", "지아이조"}};
		
		SearchActor s = new SearchActor();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배우검색: ");
		String name = sc.next();                    
		
		s.search(actor, name);
		
		
		
		
	}//main
}
