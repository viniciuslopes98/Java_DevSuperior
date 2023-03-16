package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Productt;

public class Program {

	public static void main(String[] args) {

		List<Productt> list = new ArrayList<>();

		list.add(new Productt("TV", 900.00));
		list.add(new Productt("Notebook", 1200.00));
		list.add(new Productt("Tablet", 450.00));

//		Outra forma de usar o comparator � declarando uma classe an�nima:

//		Comparator<Productt> comp = new Comparator<Productt>() {
//
//			@Override
//			public int compare(Productt p1, Productt p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//
//		};

//		Uma forma mais "enxuta" de usar o comparator � em Express�o Lambda 
//		em fun��o an�nima(Arrow function):
		
//		Comparator<Productt> comp = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};

//		Ainda � poss�vel resumir mais, deixando da seguinte forma:
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Productt p : list) {
			System.out.println(p);
		}
	}
}
