package ex8_method_work;

import java.util.Scanner;

public class PalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String ori_str = sc.next();
		
		// 키보드에서 입력받은 원본 문장을 뒤집어서 저장
		Palindrome p = new Palindrome();
		String s = p.rotate(ori_str);
		
		// 입력받은 값이 회문인지 아닌지를 판단
		if(ori_str.equals(s)) {
			System.out.println(ori_str + "은 회문이다");
		}else {
			System.out.println(ori_str + "은 회문이 아니다");
		}
	}//main
}
