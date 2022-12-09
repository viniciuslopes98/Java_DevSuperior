package dev_superior.exerciciosRepeticaoWhile;

import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite dois números: ");

		int x = leia.nextInt();
		int y = leia.nextInt();

		while (x != y) {
			if (x > y) {
				System.out.println("\n" + x + " - " + y);
				System.out.println("ORDEM DECRESCENTE! \n");
				System.out.println("Digite dois números: " + "\t\n\t\t\t(Digite números iguais para sair.)");
				x = leia.nextInt();
				y = leia.nextInt();
			} else if (x < y) {
				System.out.println("\n" + x + " - " + y);
				System.out.println("ORDEM CRESCENTE! \n");
				System.out.println("Digite dois números: " + "\t\n\t\t\t(Digite números iguais para sair.)");
				x = leia.nextInt();
				y = leia.nextInt();
			} else if (x == y) {
				break;
			}
		}

		System.out.println("Obrigado por participar!! :)");

		leia.close();
	}

}
