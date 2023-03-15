package application;

import java.util.Arrays;
import java.util.List;

public class Program {
//      Com tipos curinga podemos fazer métodos
//		que recebem um genérico de "qualquer tipo":
//      
//		NOTA: Não é possível adicionar dados a uma
//		coleção de tipo curinga.

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
//		list.add(3); Erro de compilação  --> O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
