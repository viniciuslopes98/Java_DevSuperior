package dev_superior.exerciciosRepeticaoWhile;

import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;

		System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		int codigo = leia.nextInt();

		while (codigo != 4) {
			if (codigo == 1) {
				Alcool++;
			} else if (codigo == 2) {
				Gasolina++;
			} else if (codigo == 3) {
				Diesel++;
			}
			System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = leia.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
	    System.out.printf("Alcool: %d\n", Alcool);
	    System.out.printf("Gasolina: %d\n", Gasolina);
	    System.out.printf("Diesel: %d\n", Diesel);
		
		leia.close();
	}

}
