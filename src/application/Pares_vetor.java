package application;

import java.util.Scanner;

public class Pares_vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = leia.nextInt();
		int qtdPares = 0;

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um numero: ");
			vetor[i] = leia.nextInt();
		}
		System.out.print("\nNUMEROS PARES: ");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				qtdPares++;
				System.out.printf("%d ",vetor[i]);
			}
			
		}
		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES = "+qtdPares);
		
		
		leia.close();

	}

}
