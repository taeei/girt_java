package ex3_collections;

import java.util.HashSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
		// 자바의 컬렉션(collection)
		// 많은 양의 데이터를 사용 목적에 적합한 구조로 묶어서
		// 하나로 그룹화 한 객체를 말한다
		
		// Set : 길이에 제한이 없으며, 특정 코드에서 중복된 값을 
		// 		 허용해서는 안될 때 사용.
		
		// HashSet : 정렬기능이 없다
		// TreeSet : 오름차순 정렬
		
		HashSet<Integer> hs = new HashSet<Integer>();	//<> : generic
		// 지정한 타입만 넣을 수 있음.
		// 값이 들어가는 위치는 랜덤.
		hs.add(10);	 
		hs.add(20); 
 		hs.add(5);
		hs.add(10);	// 중복값은 알아서 add 하지 않음
 		
		System.out.println("hs의 크기 : " + hs.size()); 
		System.out.println( hs );	// 배열처럼 for문 출력, 일부만 출력 불가능. (index가 없음)
		
		// Set -> 배열
		Integer[] arr = hs.toArray(new Integer[0]);	// 배열의 사이즈를 알아서 hs 크기만큼 지정
		System.out.println( arr[0] + ", " + arr[1] + ", " + arr[2] );
		
		System.out.println("---------------------");
		
		HashSet<String> s_hs = new HashSet<String>();
		s_hs.add("홍길동");
		s_hs.add("김길동");
		s_hs.add("홍길동");
		
		System.out.println("s_hs의 크기 : " + s_hs.size());
		System.out.println( s_hs );
		
		
	}//main 

}
