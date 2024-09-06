package ex5_object;

public class ObjMain {
	public static void main(String[] args) {
		
		ObjTest o1 = new ObjTest();
		String s = "Test";
		o1.setValue(s);
		
		//o1으로부터 돌려받는 타입을 캐스팅을 String으로
		// 캐스팅하여 값을 전달할 수 있다
		s = (String)o1.getValue();		
		System.out.println(s);
		
		int su = 100;
		//AutoBoxing(자동형변화): 기본자료형 -> Object
		o1.setValue(su);
		
		//UnBoxing : object -> 기본자료형
		int n = (int)o1.getValue();
		System.out.println(n);
		
	}//main
}
