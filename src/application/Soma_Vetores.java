package application;

import java.util.Scanner;

public class Soma_Vetores {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor?");
		int n = leia.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorTotal = new int[n];
		int i;

		System.out.println("Digite os valores do vetor A: ");
		for (i = 0; i < vetorA.length; i++) {
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (i = 0; i < vetorB.length; i++) {
			vetorB[i] = leia.nextInt();
			
		}
		
		for (i = 0; i < vetorTotal.length;i++) {
			vetorTotal[i] = vetorB[i] + vetorA[i];
			
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (i = 0; i < vetorTotal.length; i++) {
			System.out.println(vetorTotal[i]);
		}
		
		

		leia.close();
	}

}
