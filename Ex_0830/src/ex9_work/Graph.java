package ex9_work;

public class Graph {
	
	public void printGraph(int[] arr) {
		for(int i = 0; i < arr.length; i++) { 	//arr.length; = 10
			
			System.out.print(i +  "의 갯수 : ");
		
			for(int j = 0; j < arr[i]; j++) {
				
				System.out.print("#");
			
			}//inner
			
			System.out.println(" " + arr[i]);
			
		}//outer
		
		
	}
	
}
