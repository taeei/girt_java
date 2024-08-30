package ex6_label;

import java.util.Random;

public class Ex3_label {
	public static void main(String[] args) {
		
		out:while( true ) {
			
			int n = new Random().nextInt(3) + 1;
			
			switch(n) {
			
			case 1:
				System.out.println("hi");
				break;
			
			case 2:
				System.out.println("bye");
				break out                                                   ;
				
			}//switch
			
		}//while
		
	}//main
}
