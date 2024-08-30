package ex4_method;

import java.util.Scanner;

public class PMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// name = kim
		// age = 30
		Person p = new Person();
		String s = p.info(name, age);
		System.out.println(s);
		
	}//main

}
