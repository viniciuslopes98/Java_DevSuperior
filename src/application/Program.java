package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Computador");
		set.add("Celular");
		set.add("Fone");

		set.remove("Tablet");
		set.removeIf(x -> x.length() <= 2); //Remove todos os itens com a quantia de caracteres menor/igual a 2.
		set.removeIf(x -> x.charAt(0) == 'N');// Remove todos os itens que se inicia com o caracter 'N'.

		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("União: "+ c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Intersecção: "+d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Diferença: "+e);
	}
}
