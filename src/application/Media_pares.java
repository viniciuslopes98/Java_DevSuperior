package application;

import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = leia.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = leia.nextInt();

		}
		int somaPares = 0;
		int qtdPares = 0;

		if (vetor.length % 2 == 0) {
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] % 2 == 0) {
					qtdPares++;
					somaPares += vetor[i];
				}
			}
			double mediaPares = somaPares / qtdPares;

			System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		leia.close();

	}

}
