package dev_superior.exerciciosCondicionais;

import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a medida da glicose: ");
		double qtdGlicose = leia.nextDouble();

		if (qtdGlicose <= 100) {
			System.out.println("Sua glicose está normal :)");
		} else if (qtdGlicose >100 && qtdGlicose <= 140) {
			System.out.println("Sua glicose está elevada!");
		} else if (qtdGlicose > 140) {
			System.out.println("Você está com Diabetes!");
		} else {
			System.out.println("Digite um valor válido!!");
		}
		leia.close();
	}

}
