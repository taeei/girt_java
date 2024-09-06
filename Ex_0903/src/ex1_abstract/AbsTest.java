package ex1_abstract;

// 추상메서드를 하나라도 가지고 있는 클래스는
// 추상클래스로 정의되어야 한다
abstract public class AbsTest {

	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	// 추상메서드 : body가 없는 미완성의 메서드
	// 완성되지 않은 이 메서드를 자식이 물려받아서 완성시키는 것이 조건
	abstract public void setValue(int n);
	
	
}
