package dev_superior.exerciciosRepeticaoWhile;

import java.util.Scanner;

public class pares_consecutivos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int soma;
		
		System.out.println("Digite um numero inteiro: ");
		int x = leia.nextInt();
		
		
		while (x != 0 )  {
			if (x % 2 !=0) {
				x++;
			}
			soma = 5 * x + 20;
			System.out.printf("SOMA = %d\n", soma);

	        System.out.print("Digite um numero inteiro: ");
			x = leia.nextInt();
		}
		
		leia.close();

	}

}
