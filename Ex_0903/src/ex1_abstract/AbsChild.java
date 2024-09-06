package ex1_abstract;

public class AbsChild extends AbsTest {

	@Override
	public void setValue(int n) {
		// 추상 클래스를 상속받은 자식 클래스는 
		// 부모가 가진 추상메서드를 무조건 가지고 있어야 한다
		// 자식클래스에서 쓸 일이 없어도 가지고는 있어야 한다
		System.out.println(n);
	}

}
