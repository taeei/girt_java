package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		// ArrayList에 미리 준비해둔 단어를 3초 간격으로 추가하게 하고
		// 키보드에서 입력받은 값과 동일한 값만을 지우는 코드를 작성
		
		
		List<String> list = new ArrayList<String>();                                                  
		
		String[] fruit = {"apple", "banana", "orange", "grape"};
		
		WordGame t = new WordGame(list, fruit);
		// 데몬스레드로 지정하여 main이 종료될 때
		// 스레드도 함께 종료
		t.setDaemon(true);
		t.start();

		// list에 단어 추가할 시간 주기 1 ( 스캐너가 만들어지는 시간 동안 텀 주기 )
		Scanner sc = new Scanner(System.in);
		
		// list에 단어 추가할 시간 주기 2
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			
			//게임종료
			if(list.size() == 0) {
				break;
			}
			
			System.out.println(list);
			System.out.print(">> ");
			String write = sc.next();
			
			for( int i = 0; i < list.size(); i++ ) {
				if(write.equals(list.get(i))) {
					list.remove(i);
					break;
				}
			}//for
			
		}//while
		
		System.out.println("클리어");
		
		
	}//main
}
