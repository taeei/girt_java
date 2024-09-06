package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordGame extends Thread{
	
	private List<String> list;
	private String[] fruit;
	
	Scanner sc = new Scanner(System.in);
	
	
	public WordGame( List<String> list, String[] fruit) {
		this.list = list;
		this.fruit = fruit;
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}


	@Override
	public void run() {
		Random rnd = new Random();
		
		while(true) {
			int n = rnd.nextInt(fruit.length);
			list.add(fruit[n]);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while
		
		
	}

}
