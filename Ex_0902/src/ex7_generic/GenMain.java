package ex7_generic;

public class GenMain {
	public static void main(String[] args) {
		
		Integer[] iArr = {1, 2, 3, 4, 5};
		Double[] dArr = {1.1, 2.1, 3.1, 4.1, 5.1};
		
		GenTest gt = new GenTest();
		
		gt.printArr(iArr);		// 1 2 3 4 5
		gt.printArr(dArr);
		
	}//main
}
