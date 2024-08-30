package ex5_work;

public class Ex1_work {
	
	public static void main(String[] args) {
		
		/*
		 과수원이 있다.
		 배,사과, 오렌지를 키우고 있는데, 하루에 생산되는 과일의 객수는 
		 각각 5, 7, 5개.
		 
		 1. 과수원에서 하루에 생산되는 과일의 총 객수를 출력 17
		 2. 전체 과일의 시간당 평균 생산갯수를 출력
		 * 단, 시간당 평규을 담을 변수타입은 float으로,
		   각 과일의 갯수를 담을 변수타입은 int로 지정하세요
		 */
		
		 int pear = 5;
		 int apple = 7;
		 int orange = 5;
		 
		 int total = pear + apple + orange;
		 System.out.println("과일의 총 갯수 : " + total );
		 
		 //float avg = total / 24f;
		 float avg = (float)total /24;
		 System.out.println("전체 과일의 시간당 평균 : " + avg);
	}

}
