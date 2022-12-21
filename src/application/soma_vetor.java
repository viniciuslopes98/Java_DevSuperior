package application;

import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = leia.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Digite um numero: ");
			vetor[i] = leia.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vetor.length;i++) {
			soma += vetor[i];
			
		}
		double media = soma /n;
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vetor[i]);
	    }
		
		System.out.println("\nSOMA = "+ soma);
		System.out.printf("MEDIA = %.2f", media);
		
		leia.close();

	}

}
