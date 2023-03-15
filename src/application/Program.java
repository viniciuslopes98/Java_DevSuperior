package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product_TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<Product_TreeSet> set = new TreeSet<>();
		set.add(new Product_TreeSet("TV", 900.0));
		set.add(new Product_TreeSet("Notebook", 1200.0));
		set.add(new Product_TreeSet("Tablet", 400.0));
		for (Product_TreeSet p : set) {
		System.out.println(p);
		}
	}
}
