package dev_superior.exerciciosRepeticaoWhile;

import java.util.Scanner;

public class quadrante {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite os valores das coordenadas X e Y: ");

		int x = leia.nextInt();
		int y = leia.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Quadrante Q1 !");
				x = leia.nextInt();
				y = leia.nextInt();
			} else if (x < 0 && y > 0) {
				System.out.println("Quadrante Q2 !");
				x = leia.nextInt();
				y = leia.nextInt();
			} else if (x < 0 && y < 0) {
				System.out.println("Quadrante Q3 !");
				x = leia.nextInt();
				y = leia.nextInt();
			} else if (x > 0 && y < 0) {
				System.out.println("Quadrante Q4 !");
				x = leia.nextInt();
				y = leia.nextInt();
			} else {
				break;
			}
		}

		System.out.println("Obrigado por participar :)");

		leia.close();
	}
}
