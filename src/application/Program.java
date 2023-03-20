package application;

import java.util.ArrayList;
import java.util.List;

import entities.Productt;

public class Program {
	
	public static int compareProducts(Productt p1, Productt p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		
		List<Productt> list = new ArrayList<>();
		
		list.add(new Productt("TV", 900.00));
		list.add(new Productt("Notebook", 1200.00));
		list.add(new Productt("Tablet", 450.00));
		
		list.sort(Program::compareProducts);
		
		list.forEach(System.out::println);
	}
}
