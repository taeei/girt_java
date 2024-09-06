package ex3_interface;

public class InterMain {
	public static void main(String[] args) {
		//인터 페이스도 자식을 통해 부모와 함께 객체화 한다
		InterChild ic = new InterChild();
		
		// Interface역시 추상과 마찬가지로
		// 구현능력이 없어 직접적인 메모리 할당이 불가
		InterParent ip = new InterParent() {
			
			@Override
			public int getVALUE() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
	}//main
}
