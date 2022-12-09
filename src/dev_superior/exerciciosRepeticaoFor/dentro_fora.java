package dev_superior.exerciciosRepeticaoFor;

import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int DENTRO = 0;
		int FORA = 0;

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = leia.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			int x = leia.nextInt();

			if (x < 10 || x > 20) {
				FORA++;
			} else {
				DENTRO++;
			}
		}

		System.out.println("Dentro do intervalo: " + DENTRO);
		System.out.println("Fora do intervalo: " + FORA);

		leia.close();

	}

}
