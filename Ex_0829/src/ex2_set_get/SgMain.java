package ex2_set_get;

public class SgMain {
	public static void main(String[] args) {
		
		SGexam person1 = new SGexam();
		person1.setCompany("LG");
		person1.setName("홍길동");
		person1.setAge(20);
		
		
		String ss = person1.getCompany();
		System.out.println(ss);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		
		
		
	}//main
	
}
