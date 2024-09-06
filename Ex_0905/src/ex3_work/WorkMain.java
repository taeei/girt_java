package ex3_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		// ArrayList를 활용하여
		// 고객의 인적사항을 추가, 삭제, 조회하는 코드를 작성
		// 삭제는 이름이나 나이나 전화로 삭제
		// -----------------------
		// 1. 정보추가
		// 2. 정보삭제
		// 3. 전체정보
		// etc.종  료
		// >> 1
		// 이름 : hong
		// 나이 : 20
		// 전화 : 010-111-2222
		// 정보 저장 성공
		// 1. 정보추가
		// 2. 정보삭제
		// 3. 전체정보
		// etc.종  료
		// >> 3
		// --전체정보--
		// 등록인원 : 1명
		// hong / 20 / 010-111-2222
		
		List<Information> list = new ArrayList<Information>();
		
		Scanner sc = new Scanner(System.in);
		
		w:while(true) {
			Information info = new Information();
			
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("etc.종  료");
			
			System.out.print(">> ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:	// 정보 추가
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("나이: ");
				int age = sc.nextInt();
				System.out.print("전화: ");
				String call = sc.next();
				
				info.setName(name);
				info.setAge(age);
				info.setCall(call);

				// 값을 채운 Information 객체를 ArrayList에 담는다
				list.add(info);
				System.out.println("-----------------");
				
				break;
			
			case 2:	// 정보삭제
				System.out.print(">> 삭제:  ");
				String del_name = sc.next();
				
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equalsIgnoreCase(del_name)) {
						list.remove(i);
						System.out.println(del_name + "을 삭제함");
						break;
					}
					
				}//for
				break;
				
				
			case 3:	// 전체 정보
				System.out.println("-------전체정보-------");
				System.out.println("등록인원 : " + list.size() + "명");
				for(int i = 0; i < list.size(); i++) {
					System.out.printf("%s / %d / %s\n",
									list.get(i).getName(),
									list.get(i).getAge(), 
									list.get(i).getCall());
				System.out.println("-------------------");
				}
				break;
				
			default:
				System.out.println("종료");
				break w;
				// return; 도 가능
			}
		}
		
		
	}//main
}
