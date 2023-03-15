package application;

import java.util.Arrays;
import java.util.List;

public class Program {
//      Com tipos curinga podemos fazer m�todos
//		que recebem um gen�rico de "qualquer tipo":
//      
//		NOTA: N�o � poss�vel adicionar dados a uma
//		cole��o de tipo curinga.

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
//		list.add(3); Erro de compila��o  --> O compilador n�o sabe qual � o tipo espec�fico do qual a lista foi instanciada.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
