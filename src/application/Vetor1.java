package application;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n = leia.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = leia.nextDouble();

		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum /n;
		
		System.out.printf("Média das alturas: %.2f ",avg);
		
		leia.close();
	}

}
