package dev_superior.exerciciosCondicionais;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Voce vai digitar a temperatura em qual escala (C/F) ? ");
		char qualTemp = leia.next().charAt(0);

		if (qualTemp == 'F') {
			System.out.println("Digite a temperatura em Fahrenheit: ");
			double tempF = leia.nextDouble();
			double conversaoC = (tempF - 32) * 5 / 9;
			System.out.printf("A temperatura em Celsius é %.2f: ", conversaoC);
		} else if (qualTemp == 'C') {
			System.out.println("Digite a temperatura em Celsius: ");
			double tempC = leia.nextDouble();
			double conversaoF = (tempC * 9 / 5) + 32;
			System.out.printf("A temperatura em Fahrenheit é %.2f: ", conversaoF);

		} else {
			System.out.println("Valor inválido! Digite somente F ou C !!");
		}

		leia.close();
	}

}
