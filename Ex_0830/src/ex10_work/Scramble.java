package ex10_work;

import java.util.Random;

public class Scramble {
	
	private String answer;	// 정답
	private String shake;	// 정답을 섞은 문제
	
	//생성자 함수
	public Scramble(String[] strArr) {
		answer = "";
		shake = "";
		
		int idx = new Random().nextInt( strArr.length ); //strArr 길이만큼의 수 중 하나를 고름
		answer = strArr[idx];
	}
	
	public String getAnswer() {
		return answer;
	}
	
	// 정답을 섞어서 문제로 만든다
	public String scrambledWord() {
		
		// 정답을 문자 단위로 끊어서 저장할 예정
		int[] inArr = new int[answer.length()];   // answer = "VIEW" 라면 inArr = {0,0,0,0}
		
		// inArr배열에 중복되지 않는 난수를 발생
		outer : for(int i = 0; i < inArr.length; ) {
			
			inArr[i] = new Random().nextInt(answer.length());
			
			for(int j = 0; j < i; j++) {
				if( inArr[i] == inArr[j] ) {
					continue outer;			// inArr = {3, 0, 2, 1}
				}
			}//inner
			
			i++;
		}//outer
		
		// 위에서 발생시킨 난수를 기반으로 문장을 섞는다
		for(int i = 0; i < answer.length(); i++) {
			shake += answer.charAt( inArr[i] );		// shake = "WVEI"
		}//for
		
		return shake;
		
	}

}
