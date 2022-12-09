package dev_superior.exerciciosRepeticaoFor;

import java.util.Scanner;

public class impares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int soma = 0;

		System.out.println("Digite dois números: ");
		int x = leia.nextInt();
		int y = leia.nextInt();

		if (x > y) {
			int inverte = x;
			x = y;
			y = inverte;
		}

		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}

		System.out.printf("SOMA DOS IMPARES = %d\n", soma);
		leia.close();
	}

}
