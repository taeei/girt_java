package ex2_output;

import java.io.PrintStream;

public class Ex1_output {
	
	public static void main(String[] args) {
		
		// PrintStream은 OutStream의 대표적인 자식클래스다
		// 화면에 데이터를 출력하기 위해 만들어져 있는 클래스
		
		PrintStream ps = System.out;
		ps.write(65);
		ps.write('B');
		ps.write('\n');
		ps.write('1');
		
		// 스트림을 닫아줘야, 더이상 write 할 내용이 없다고 판단하여
		// 실제로 콘솔에 데이터를 출력할 수 있다
		ps.close();
		
	}//main
}
