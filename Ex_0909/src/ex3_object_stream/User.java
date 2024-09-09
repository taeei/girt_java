package ex3_object_stream;

import java.io.Serializable;

public class User implements Serializable{  // 부모가 Serializable. 직렬화 작업
	
	// ObjectStream으로 클래스를 기록하거나 읽어오려면
	// 객체의 직렬화가 필수이다.
	// 메모리에 각각 흩어져 있는 멤버(변수)들을 한번에 쓰고 받을 수 있도록 
	// 새로운 메모리 영역에 일렬로 만들어서 복사해두는 작업을
	// 객체의 '직렬화' 라고 한다.

	private String name;
	private int age;
	private String tel;
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
