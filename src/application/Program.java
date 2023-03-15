package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product_Set;

public class Program {

	public static void main(String[] args) {
		Set<Product_Set> set = new HashSet<>();

		set.add(new Product_Set("TV", 900.0));
		set.add(new Product_Set("Notebook", 1200.0));
		set.add(new Product_Set("Tablet", 400.0));

		Product_Set prod = new Product_Set("Notebook", 1200.0);

		System.out.println(set.contains(prod));//Precisa implementar Hashcode & Equals na classe Product_Set. 
	}
}
