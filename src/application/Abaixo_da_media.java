package application;

import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = leia.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = leia.nextDouble();
		}
		double soma = 0.0;
		
		for(int i = 0; i < vetor.length;i++) {
			soma += vetor[i];
			
		}
		double media = soma / n;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n",media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for(int i = 0; i < vetor.length;i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
				
			}
			
		}
		
		
		
		leia.close();
	}

}
