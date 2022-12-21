package application;

import java.util.Scanner;

public class NegativosVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = leia.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
		
			System.out.print("Digite um numero: ");
			vect[i] = leia.nextInt();
		}
		
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i=0; i<n; i++) {
	        if (vect[i] < 0) {
	        	System.out.printf("%d\n", vect[i]);
	        }
	    }
		
		leia.close();
	}

}
