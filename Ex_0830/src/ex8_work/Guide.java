package ex8_work;

public class Guide {
	
	static String point;
	Guest[] guest;
	
	public Guide(int n) {
		
	// 함께 여행할 관광객의 수
		point = "불국사";
		
		guest = new Guest[n];
		for(int i = 0; i <guest.length;	i++) {
			guest[i] = new  Guest();
		}
	}
}
