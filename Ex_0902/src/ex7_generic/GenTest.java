package ex7_generic;

public class GenTest {

	// 특정 메서드에서만 제너릭 타입을 지정하는 것도 가능
	public <T> void printArr(T[] value) {	
		for(int i = 0; i < value.length; i++) {
			System.out.print(value[i] + " ");
		}
		System.out.println();
	}
	
	
	
}
