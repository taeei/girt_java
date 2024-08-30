package ex8_work;

public class Guest {
	
	
	static int num;
	static String[] name = new String[num];
	static int[] age = new int[num];
	
	public void guestName( String s ) {
		
		
	}
	
	
	public void guestAge( int a ) {
		
	}
	
	public void show() {
		for(int i = 0; i < name.length;	i ++) {
			System.out.println(name[i]);			
		}
		
	}
	
	
	
	
}