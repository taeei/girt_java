package ex2_set_get;

public class SGexam {

	private String company = "삼성";
	private String name;
	private int age;
	
	//setter
	public void setCompany(String com) {
		company = com;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
}
