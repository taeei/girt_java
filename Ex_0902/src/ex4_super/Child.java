package ex4_super;

public class Child extends Parent {
	
	// super : 부모클래스
	// super(); : 부모생성자 호출
	// super.method(): 부모의 메서드
	// super.name : 부모의 변수

	public Child() {
		super(10);	//부모클래스의 생성자 : 자식 생성자보다 먼저 만들어짐
		System.out.println("Child의 생성자");
	}
	
	@Override
	public int getValue() {
		// 부모의 getValue()를 호풀	   
		         //Parent.getValue();
		//return super.getValue();
		return 100;
	}
	
	public void setValue(int value) {
		// Parent가 가진 value 변수에 값
		super.value = value;
	}
	

	
	
}
