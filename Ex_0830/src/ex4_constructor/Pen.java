package ex4_constructor;

public class Pen {
	
	private String company;
	private int price;
	private String color;
		
	public Pen() {
		
	}
	
	public Pen( String color ) {
		this.color = color;
	}
	
	public Pen(int price, String color) {
		company = "monami";
		this.price = price;
		this.color = color;
		
	}

	public String getCompany() {
		return company;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
	
	
}
