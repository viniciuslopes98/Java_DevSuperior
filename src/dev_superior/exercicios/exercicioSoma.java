package dev_superior.exercicios;

import java.util.Scanner;

public class exercicioSoma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um valor para X: ");
		int valorX = leia.nextInt();
		
		System.out.println("Digite um valor para Y: ");
		int valorY = leia.nextInt();
		
		double soma = valorX += valorY;
		
		System.out.println("A soma dos valores é de: "+soma);
		
		leia.close();
	}

}
