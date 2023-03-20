package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Productt;

public class Program {

	public static void main(String[] args) {

		List<Productt> list = new ArrayList<>();

		list.add(new Productt("Tv", 900.00));
		list.add(new Productt("Mouse", 50.00));
		list.add(new Productt("Tablet", 350.50));
		list.add(new Productt("HD Case", 80.90));
		
		double min = 100.0;
		
		Predicate<Productt> pred = p -> p.getPrice() >= min;
		
//		list.removeIf(new ProductPredicate()); --> Exemplo 1.
//		list.removeIf(Productt::staticProductPredicate); --> Exemplo 2 (Referencia para método)
//		list.removeIf(Productt::nonStaticProductPredicate); --> Exemplo 3 (Referencia para método não static)
//		list.removeIf(pred); --> Exemplo 4 (Expressão lambda declarada)
		list.removeIf(p -> p.getPrice() >= min);// --> Exemplo 5 (Expressão lambda inline)
		
		for(Productt p : list) {
			System.out.println(p);
		}
	}
}
