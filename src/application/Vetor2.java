package application;

import java.util.Scanner;

import entities.Product3;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n = leia.nextInt();
		
		Product3[] vect = new Product3[n];
		
		for (int i = 0; i < vect.length; i++) {
			leia.nextLine();
			String name = leia.nextLine();
			double price = leia.nextDouble();
			vect[i] = new Product3(name, price);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
			
		}
		double media = soma / vect.length;
		
		System.out.printf("A média dos preços é de: %.2f",media);
		
		leia.close();
	}

}
