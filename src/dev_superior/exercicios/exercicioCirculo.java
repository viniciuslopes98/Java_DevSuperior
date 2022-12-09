package dev_superior.exercicios;

import java.util.Scanner;

public class exercicioCirculo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		System.out.println("Digite o valor do raio do circulo: ");
		double raio = leia.nextDouble();
		
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("O valor da área do circulo é de: %.3f",area);
		
		leia.close();
	}

}
