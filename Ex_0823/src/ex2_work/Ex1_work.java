package ex2_work;

import java.util.Random;

public class Ex1_work {

	public static void main(String[] args) {
		
		// 변수 money에 10 ~ 5000 사이의 난수를 발생시켜 넣는다
		// 단, 1710, 3450과 같이 1의자리 숫자는 반드시 0이어야 한다
		// coin배열을 사용하여 난수 money를 동전으로 바꿨을 때
		// 가장 적은 수의 동전으 사용하는 경우의 수 출력
		// ----------------------------
		// 값 : 2590  (키보드에서 받는 것 X)
		// 500원 : 5
		// 50원 : 1
		// 10원 : 4
		
		int[] coin = {500, 100, 50, 10};
		
		int money = new Random().nextInt(500) + 1;  // 1의 자리 0 으로 만드는 방법
		money *= 10;               // 1~500 에서 10을 곱해서 1의 자리 0으로 만듬
		
		System.out.println("값 : " + money);
		
		for(int i = 0; i < coin.length; i++) {
			
			int res = money / coin[i];            // 
			
			if( res > 0 ) {                       // 몫이 있을 때만 출력
				System.out.println(coin[i] + "원 : " + res);
				money %= coin[i];                // money를 나머지값으로 바꾼다
			}//if
			
			
		}//for
		
//		if( money % 10 == 0) {
//			System.out.println("값 : " + money);	
//			
////			for(int i = 0; i) {
////				
////			}
//			
//			
//		}
		
		
	}//main
	
}
