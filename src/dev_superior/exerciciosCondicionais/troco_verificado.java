package dev_superior.exerciciosCondicionais;

import java.util.Scanner;

public class troco_verificado {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Preço unitário do produto: ");
		double preco = leia.nextDouble();

		System.out.println("Quantidade comprada: ");
		double qtd = leia.nextInt();

		System.out.println("Dinheiro recebido: ");
		double recebido = leia.nextDouble();

		double total = preco * qtd;

		if (total > recebido) {
			double falta = total - recebido;
			System.out.println("Falta pagar: " + falta);
		} else {
			double troco = recebido - total;
			System.out.println("Troco: " + troco);
		}

		leia.close();

	}

}
