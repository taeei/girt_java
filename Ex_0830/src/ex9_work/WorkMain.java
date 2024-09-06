package ex9_work;

import java.util.Random;

public class WorkMain {
	public static void main(String[] args) {
		
		// 0~9 사이의 난수를 100개 발생시킨다
		// 100 개의 수를 분석하여 0의 갯수부터 9의 객수까지를 그래프와 하시오
		// ----------------
		//32742390480298409824....
		// 0의 갯수 : ##### 5
		// 1의 객수 : ####### 7
		// ......
		// 9의 갯수 : ### 3
		
		int[] nArr = new int[10];		//nArr = {0,0,0,0,0,0,0,0,0,0}
		
		for(int i = 0; i < 100; i++) {			// 난수 100개 생성
			int rnd = new Random().nextInt(10);		// 1~9 까지의 난수
			System.out.print(rnd);				// 난수 출력
			nArr[rnd]++;						// 난수가 3이면 nArr 배열의 nArr[3]에 +1 
			
		}//for
		
		System.out.println();
		
		Graph gp = new Graph();
		gp.printGraph(nArr);
		
		
		
		
	}//main

}
