package ex3_collections;

import java.util.HashMap;

public class Ex4_Map {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("k1", 100);
		hm.put("k1", 200);
		hm.put("k2", 100);
		hm.put("k3", 300);
		
		if( hm.containsKey("k1") ) {	// "k1"이라는 이름의 key 값이 있으면
			System.out.println( hm.get("k1"));
		}
		
		// 
		if( hm.containsValue(200) ) {	// 200이라는 value값이 있으면
			System.out.println("hm은 200을 가지고 있음");
		}
		
		System.out.println( hm.size() );
		System.out.println(hm);
		
	}//main
}
