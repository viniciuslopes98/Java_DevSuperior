package entities;

public class Product_Exc {

	private String name;
	private Double price;
	
	public Product_Exc() {
		
	}

	public Product_Exc(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name + " $ "+price;
	}
	
}
