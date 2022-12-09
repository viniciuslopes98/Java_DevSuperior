package dev_superior.exerciciosRepeticaoWhile;

import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int qtdIdade = 0;
		double somaIdades = 0;
		double mediaIdades = 0;

		System.out.println("Digite as idades: ");

		int idades = leia.nextInt();

		if (idades < 0) {
			System.out.println("Impossível calcular!!");
		} else {
			while (idades > 0) {
				qtdIdade++;
				somaIdades += idades;
				idades = leia.nextInt();
			}
			mediaIdades = somaIdades / qtdIdade;
			System.out.printf("A média das idades é de %.2f%n", mediaIdades);

		}

		leia.close();
	}

}
