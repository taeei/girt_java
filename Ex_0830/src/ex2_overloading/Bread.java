package ex2_overloading;

public class Bread {
	
	
	// 1) 인자가 없는 메서드
	public void makeBread() {
		System.out.println("빵을 만들었습니다\n");
	}
	
	// 2) 빵의 갯수를 인자로 받는 메서드
	public void makeBread(int n) {
		for( int i = 1; i <=n; i++) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.println(n+"개의 빵을 만들었습니다\n");
	}
	
	// 3) 빵의이름, 갯수를 인자로 받는 메서드 
	public void makeBread(int n, String s) {
		for(int i = 1; i <=n; i++) {
			System.out.println(s+"을 만들었습니다");
		}
		System.out.printf("%d개의 %s을 만들었습니다\n",n, s);
	}

}
