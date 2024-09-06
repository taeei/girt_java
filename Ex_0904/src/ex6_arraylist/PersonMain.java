package ex6_arraylist;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	
	public static void main(String[] args) {
		
		// String, Integer를 같이 list에 담고 싶을 때 Person객체 사용
		List<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(22);
		
		Person p2 = new Person();
		p2.setName("김길동");
		p2.setAge(30);
		
		list.add(p1);
		list.add(p2);
		
		p2.setName("임길동");
		
		for(int i = 0; i < list.size(); i++) {
			
			//arraylist로 get으로 방을 들어가서 원하는 값을 선택해서 출력
			System.out.println("이름 : " + list.get(i).getName());	
			System.out.println("나이 : " + list.get(i).getAge());
			System.out.println("------------------------");
			
		}//for
		
	}//main
}
