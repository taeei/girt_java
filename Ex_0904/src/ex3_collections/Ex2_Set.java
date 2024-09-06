package ex3_collections;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex2_Set {
	public static void main(String[] args) {
		
		// HashSet을 이용하여 중복되지 않는 6개의 난수를 출력하는
		// 로또번호 생성기 만들기(1 ~ 45)
		
		HashSet<Integer> hs = new HashSet<Integer>();
		Random rnd = new Random();
		
		while (true) {
			int n = rnd.nextInt(45) + 1;
			hs.add(n);

			if(hs.size() == 6) {
				break;
			}
			
		}//while
		
		System.out.println(hs);
		
		System.out.println("------------------------");
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while(ts.size() < 6) {
			ts.add( rnd.nextInt(45) + 1 );
		}
		
		System.out.println(ts);
		
		System.out.println("-------------------------");
		
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("강하늘");
		names.add("john");
		names.add("adam");
		names.add("가길동");
		
		System.out.println(names);
		
		
	}//main
	
}
