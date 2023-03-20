package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Productt;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		List<Productt> list = new ArrayList<>();

		list.add(new Productt("Tv", 900.00));
		list.add(new Productt("Mouse", 50.00));
		list.add(new Productt("Tablet", 350.50));
		list.add(new Productt("HD Case", 80.90));

		double factor = 1.1;
		
		Consumer<Productt> cons = p -> p.setPrice(p.getPrice() * factor);
		
		
//		list.forEach(new PriceUpdate()); Exemplo 1 --> Implementação da interface padrão.
//		list.forEach(Productt::staticPriceUpdate); Exemplo 2 --> Referência para o método, método static.
//		list.forEach(Productt::nonStaticPriceUpdate); Exemplo 3 --> Referência para o método, método NÃO static.
//		list.forEach(cons); Exemplo 4 --> Expressão lambda declarada.
		list.forEach(p -> p.setPrice(p.getPrice() * factor)); // Exemplo 5 --> Expressão lambda inline.
		
		list.forEach(System.out::println);
	}

}
