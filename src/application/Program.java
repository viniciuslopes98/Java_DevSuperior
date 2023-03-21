package application;

import java.util.ArrayList;
import java.util.List;

import entities.Productt;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {

//		Fazer um programa que, a partir de uma lista de produtos, calcule a
//		soma dos preços somente dos produtos cujo nome começa com "T".
		
		List<Productt> list = new ArrayList<>();

		list.add(new Productt("Tv", 900.00));
		list.add(new Productt("Mouse", 50.00));
		list.add(new Productt("Tablet", 350.50));
		list.add(new Productt("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = "+ String.format("%.2f", sum));
	}

}
