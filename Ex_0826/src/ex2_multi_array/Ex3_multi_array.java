package ex2_multi_array;

public class Ex3_multi_array {
	public static void main(String[] args) {
		
		String[][] stu = {{"길순", "100", "90"},           
			              {"길동", "80", "92", "85"}};
		// 작은 방 갯수가 다를 때가 있기 때문에 아래 공식 사용 
		
		for(int i = 0; i < stu.length; i++) {    // 큰 방 2회전
			
			for(int j = 0; j < stu[i].length; j++) {  // i = 0일 때  3회전, i = 1 일 때 4회전
				
				System.out.print(stu[i][j] + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		
	}//main
}
