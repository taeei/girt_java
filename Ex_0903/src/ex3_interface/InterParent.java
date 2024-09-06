package ex3_interface;

public interface InterParent {
	// 인터페이스는 서비스 요청에 따른 중개자 역할을 한다
	
	// 인터페이스는 상수와 추상메서드 이외에는 어떤것도 담을 수 없다
	final int VALUE = 100;
	abstract int getVALUE();
	
	
}
