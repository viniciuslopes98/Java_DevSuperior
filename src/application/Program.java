package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product_map;

public class Program {

	public static void main(String[] args) {

		Map<Product_map, Double> stock = new HashMap<>();
		
		Product_map p1 = new Product_map("Tv", 900.0);
		Product_map p2 = new Product_map("Notebook", 1200.0);
		Product_map p3 = new Product_map("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product_map ps = new Product_map("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	
	}
}
