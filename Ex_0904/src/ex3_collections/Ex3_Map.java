package ex3_collections;

import java.util.HashMap;

public class Ex3_Map {
	public static void main(String[] args) {
		
		// Map은 키(Key)와 값(value)을 하나의 데이터로 묶어서 저장한다
		// 키를 통해 원하는 값을 검색하므로 많은 양의 데이터를 조회하는데
		// 매우 뛰어난 성능을 발휘한다
		
		// map은 중복된 key값을 허용하지 않는다
		// key가 중복될 경우 마지막에 추가한 값을 갱신된다
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 100);	// map에서 값을 저장할 때는 put. put 사용하면 무조건 map
		map1.put(2, 200);
		map1.put(5, 300);
		map1.put(3, 400);
		map1.put(5, 500);	
		
		map1.put(3, 1000);
		
		map1.remove(3);	// key값이 3인 값을 메모리에서 지우기
		
		System.out.println(map1.size());
		System.out.println(map1);
		
		int res = map1.get(2);		//200
		System.out.println(res);
		
	}//main
}
