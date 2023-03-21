package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Productt;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Productt> list = new ArrayList<>();

		list.add(new Productt("Tv", 900.00));
		list.add(new Productt("Mouse", 50.00));
		list.add(new Productt("Tablet", 350.50));
		list.add(new Productt("HD Case", 80.90));

		Function<Productt, String> func = p -> p.getName().toUpperCase();
		
//		Exemplo 1 --> Padr�o, implementa��o da interface.
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

//		Exemplo 2 --> Refer�ncia ao m�todo, com m�todo static.
//		List<String> names = list.stream().map(Productt::staticUpperCaseName).collect(Collectors.toList());
		
//		Exemplo 3 --> Refer�ncia ao m�todo, com m�todo N�O static.
//		List<String> names = list.stream().map(Productt::nonStaticUpperCaseName).collect(Collectors.toList());
		
//		Exemplo 4 --> Express�o lambda declarada.
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
//		Exemplo 5 --> Express�o lambda inline.
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
