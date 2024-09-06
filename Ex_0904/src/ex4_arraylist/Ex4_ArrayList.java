package ex4_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_ArrayList {
	public static void main(String[] args) {
		
		// id : aaa
		// [aaa]
		// id : bbb
		// [aaa, bbb]
		// id : aaa
		// 중복된 id
		// id : ccc
		// [aaa, bbb, ccc]
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		w : while(true) {
			System.out.print("id : ");
			String id = sc.next();
			
			if( list.contains(id) ) {	//list에 id가 있으면
				System.out.println("중복된 id");
				continue;
			}
			
//			for(int i = 0; i < list.size(); i++) {
//				if(list.get(i).equals(s)) {	// String 비교 :equals
//					System.out.println("중복된 id");
//					continue w;
//				}
//			}//for
			
			list.add(id);
			System.out.println(list);
			
		}//while
		
	}
}
