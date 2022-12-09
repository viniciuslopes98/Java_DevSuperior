package dev_superior.exerciciosRepeticaoWhile;

import java.util.Scanner;

public class validacao_de_nota {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int qtdNotas = 2;
		double somaNotas;
		double media;

		System.out.println("Digite a primeira nota: ");
		double nota1 = leia.nextDouble();

		while (nota1 < 0 || nota1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota1 = leia.nextDouble();
		}

		System.out.println("Digite a segunda nota: ");
		double nota2 = leia.nextDouble();

		while (nota2 < 0 || nota2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota2 = leia.nextDouble();
		}

		somaNotas = nota1 += nota2;
		media = somaNotas / qtdNotas;

		System.out.println("A média semestral é de: " + media);
		System.out.println("\t\t Obrigado!");

		leia.close();
	}

}
