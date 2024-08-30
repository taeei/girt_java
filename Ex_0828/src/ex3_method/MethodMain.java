package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest m1 = new MethodTest();
		m1.test1();		// 반환형 x
		
		int su = 100;	
		//int str = m1.test2(su); 		// 반환형 o. 반환값 타입 맞춰서 지정 	
		su = m1.test2(su);
		
		System.out.println("su: " + su); // su : 100
		
		
	}//main
	
}
