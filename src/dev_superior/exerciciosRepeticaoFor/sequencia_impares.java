package dev_superior.exerciciosRepeticaoFor;

import java.util.Scanner;

public class sequencia_impares {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor de X: ");
		int x = leia.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d\n", i);
			}

		}

		leia.close();

	}

}
