package ex2_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println("Dog");
		System.out.println("눈: " + dog.getEye());
		System.out.println("다리: " + dog.getLeg());
		System.out.println("특기: " + dog.nose);
		
		System.out.println("---------------");
		
		Elephant ele = new Elephant();
		System.out.println("Elephant");
		System.out.println("눈: " + ele.getEye());
		System.out.println("다리: " + ele.getLeg());
		System.out.println("특기: " + ele.hand);
		
		System.out.println("---------------");
		
		Snake snake = new Snake();
		System.out.println("snake");
		System.out.println("눈: " + snake.getEye());
		System.out.println("다리: " + snake.getLeg());
		System.out.println("특기: " + snake.sensor);
		
		System.out.println("---------------");
		
		Spider spider = new Spider();
		System.out.println("spider");
		System.out.println("눈: " + spider.getEye());
		System.out.println("다리: " + spider.getLeg());
		System.out.println("특기: " + spider.web);
		
		
	}//main
	
}
