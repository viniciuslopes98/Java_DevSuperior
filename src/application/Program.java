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
		
		
//		list.forEach(new PriceUpdate()); Exemplo 1 --> Implementa��o da interface padr�o.
//		list.forEach(Productt::staticPriceUpdate); Exemplo 2 --> Refer�ncia para o m�todo, m�todo static.
//		list.forEach(Productt::nonStaticPriceUpdate); Exemplo 3 --> Refer�ncia para o m�todo, m�todo N�O static.
//		list.forEach(cons); Exemplo 4 --> Express�o lambda declarada.
		list.forEach(p -> p.setPrice(p.getPrice() * factor)); // Exemplo 5 --> Express�o lambda inline.
		
		list.forEach(System.out::println);
	}

}
