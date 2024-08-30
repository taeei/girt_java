package ex8_work;

public class SearchActor {
	
	private int cnt;
	
	public void search(String[][] actor, String name) {

		out : for(int i = 0; i < actor.length; i++ ) {	//actor.length = 3
			
			if( actor[i][0].equals("[" + name + "]")) {
					
				for(int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
		
			}else {
				cnt++;
				// 올바른 검색을 해도 "해당 배우가.."가 뜨기 때문에 actor배열의 수 만큼 카운트 됐을 때 출력
				if( cnt >= actor.length) {
					System.out.println("해당 배우가 존재하지 않습니다");
					
				}
					
				}//inner
			
		}//outer
		
		
	}
	

}
