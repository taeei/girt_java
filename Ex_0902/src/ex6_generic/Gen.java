package ex6_generic;

// 제너링 프로그래밍
// 일반적인 코드를 작성하지만, 이 코드를 다양한 타입의 객체에 대해
// 재활용이 용이하도록 하는 기법
public class Gen<T> {

	T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
