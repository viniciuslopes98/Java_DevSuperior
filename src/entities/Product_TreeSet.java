package entities;

import java.util.Objects;

public class Product_TreeSet implements Comparable<Product_TreeSet>{

	private String name;
	private Double price;

	public Product_TreeSet(String name, Double price) {
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

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product_TreeSet other = (Product_TreeSet) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Product_TreeSet [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product_TreeSet o) {
		
		return name.toUpperCase().compareTo(o.getName().toUpperCase());
	}
	
	
}
