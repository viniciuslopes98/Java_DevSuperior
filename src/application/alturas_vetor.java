package application;

import java.util.Scanner;

import entities.Pessoa;

public class alturas_vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas ?");
		int n = leia.nextInt();

		Pessoa[] pessoas = new Pessoa[n];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("\nDados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.print("Idade: ");
			int idade = leia.nextInt();
			System.out.println("Altura: ");
			double altura = leia.nextDouble();

			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		double somaAlturas = 0.0;
		double mediaAlturas;

		for (int i = 0; i < pessoas.length; i++) {

			somaAlturas += pessoas[i].getAltura();

		}
		mediaAlturas = somaAlturas / n;
		int menores = 0;
		double percentual;

		System.out.printf("\nAltura média: %.2f%n", mediaAlturas);
		
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				menores++;
			}
		}

		percentual = ((double)menores /n) * 100;
		System.out.print("Pessoas com menos de 16 anos: "+ percentual+"%\n");
		
		for(int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
			
		}

		leia.close();
	}

}
