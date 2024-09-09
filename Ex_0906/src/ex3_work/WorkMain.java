package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
//		***HANGMAN***
//		Word : ☆☆☆☆☆☆☆ >> a
//		a이(가) 포함되어 있지 않습니다.
//		Word : ☆☆☆☆☆☆☆ >> e
//		Word : ☆☆☆☆e☆☆ >> i
//		i이(가) 포함되어 있지 않습니다.
//		Word : ☆☆☆☆e☆☆ >> o
//		Word : ☆☆o☆e☆☆ >> u
//		u이(가) 포함되어 있지 않습니다.
//		Word : ☆☆o☆e☆☆ >> o
//		o(은)는 이미 입력한 문자입니다.
//		Word : ☆☆o☆e☆☆ >> aa
//		한글자의 영 소문자만 입력 가능합니다.
//		Word : ☆☆o☆e☆☆ >> r
//		Word : ☆ro☆e☆☆ >> p
//		Word : pro☆e☆☆ >> t
//		Word : pro☆e☆t >> j
//		Word : proje☆t >> c
//		project정답
//		12회만에 정답!
		
		Scanner sc = new  Scanner(System.in);
		
		String[] word = {"apple", "banana", "grape", "orange"}; 
		
		int rnd = new Random().nextInt(word.length);
		
		PlayGame pg = new PlayGame();
		int playCount = pg.play(word[rnd]);
		
		HighScore his = new HighScore();
		his.outputScore( playCount );
		
		
		
		
//		String word_p = "";
//		String correct = "";
//		
//		int n = rnd.nextInt(word.length);
//		word_p += word[n];
//		
//		System.out.println("***HANGMAN***");
//		System.out.print("Word : ");
//		for(int i = 0; i < word_p.length(); i++) {
//			System.out.print("☆");
//		}//for
//		
//		
//		while(true) {
//			
//			System.out.print(" >> ");
//			String input = sc.next();
//			char in = input.charAt(0);
//			
//			System.out.print("Word : ");
//			for(int i = 0; i < word_p.length(); i++) {
//				if( in == word_p.charAt(i) ) {
//					correct += in;
//				}else {
//					correct += "☆";
//				}
//			}//for
//			
//			System.out.print(correct);
//		}//while
		
		
//		while(true) {
//			
//			System.out.print(" >> ");
//			String input = sc.next();
//			char in = input.charAt(0);
//			
//			for(int i = 0; i < word_p.length(); i++) {
//				if( in == word_p.charAt(i) ) {
//					
//					System.out.print("Word : ");
//					for(int j = 0; j < word_p.length(); j++) {
//						if(in == word_p.charAt(j)) {
//							System.out.print(in);
//						}else {
//							System.out.print("☆");
//						}
//					}//for
//					
//				}else {
//					System.out.println(in + "이(가) 포함되어 있지 않습니다");
//				}
//			}//for
//			
//			
//		}//while
		
	}//main
}
