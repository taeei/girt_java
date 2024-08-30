package ex2_overloading;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread b = new Bread();

		// 1) makeBread()
		// 빵을 만들었습니다
		b.makeBread();
		
		// 2) makeBread()
		// 빵을 만들었습니다
		// 빵을 만들었습니다
		// 2개의 빵을 만들었습니다 //원하는 갯수만큼
		b.makeBread(2);
		
		// 3) makeBread()
		// 크림빵을 만들었습니다
		// 크림빵을 만들었습니다
		// 2개의 크림빵을 만들엇습니다
		b.makeBread(2, "크림빵");
	
		
	}//main
}
