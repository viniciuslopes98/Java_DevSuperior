package application;

import java.util.Scanner;

public class MaiorPosicao_Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = leia.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = leia.nextDouble();

		}
		double maior = vetor[0];
		int posicaoMaior = 0;

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicaoMaior = i;
			}

		}

		System.out.printf("MAIOR VALOR = %.1f\n",maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n",posicaoMaior);

		leia.close();

	}

}
