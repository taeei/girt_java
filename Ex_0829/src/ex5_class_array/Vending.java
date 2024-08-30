package ex5_class_array;

public class Vending {
	
	private Can[] cans = new Can[5];
	private int money;
	
	// 음료수의 종류와 가격을 초기화
	public Vending() {
			
			// 생성자 함수 이용한 코드
			cans[0] = new Can("fanta", 1000);
			cans[1] = new Can("cider", 1200);
			cans[2] = new Can("orange", 800);
			cans[3] = new Can("banana", 1100);
			cans[4] = new Can("coke", 900);
		}
		
		
		// 사용 안 한 코드
//	public void init() {
//		for(int i = 0; i < cans.length; i++) {
//			cans[i] = new Can();
//		}
			
//		cans[0].setName("fanta");
//		cans[0].setPrice(1000);
//		
//		cans[1].setName("vita");
//		cans[1].setPrice(900);
//		
//		cans[2].setName("coke");
//		cans[2].setPrice(1200);
//		
//		cans[3].setName("sprite");
//		cans[3].setPrice(1100);
//		
//		cans[4].setName("water");
//		cans[4].setPrice(600);	
//			}//init
	
	// 들어온 금액으로 마실 수 있는 음료의 목록 출력
	public void showCans( int m ) {
		money = m;
		
		for(int i = 0; i < cans.length; i++) {
			
			if(cans[i].getPrice() <= money) {
				System.out.printf("%s - %d\n", cans[i].getName(), cans[i].getPrice());
			}
			
		}//for
	}//showCans
	
	// 음료를 선택하고 잔액을 계산하는 메서드
	public void selectCan(String name) {
		for( int i = 0; i < cans.length; i++) {
			if(cans[i].getName().equalsIgnoreCase(name)) {  // 선택한 음료가 있는 지 확인
				
				System.out.println(name + "을 선택함");
				System.out.println(money - cans[i].getPrice() + "원"); // 잔액
			
			}
		}//for
	}//selectCan
	
}
