package dev_superior.exerciciosCondicionais;

import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {

		double valorFixo = 50.0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a quantidade de minutos: ");
		int minutos = leia.nextInt();

		if (minutos > 100) {
			double multa = (minutos - 100) * 2;
			System.out.println("Valor a pagar: " + (valorFixo + multa));
		} else {
			System.out.println("Valor a pagar: " + valorFixo);
		}

		leia.close();
	}

}
