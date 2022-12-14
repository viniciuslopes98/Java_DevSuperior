package application;

import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Conta cliente;

		System.out.println("\nEntre com numero da conta: ");
		int conta = leia.nextInt();

		System.out.print("\nEntre com seu nome:");
		leia.nextLine();
		String nome = leia.nextLine();

		System.out.print("\nVocê deseja fazer um deposito inicial (s/n)?");
		char resposta = leia.next().charAt(0);
		if (resposta == 's') {

			System.out.print("\nEntre com o valor do depósito inicial: ");
			double depositoInicial = leia.nextDouble();
			cliente = new Conta(nome, conta, depositoInicial);
		} else {
			cliente = new Conta(conta, nome);
		}

		System.out.println("\nAccount data: ");
		System.out.println(cliente);

		System.out.println("Entre com o valor do depósito: ");
		double valorDeposito = leia.nextDouble();
		cliente.deposito(valorDeposito);

		System.out.println("\nAccount data: ");
		System.out.println(cliente);

		System.out.println("Entre com o valor que deseja sacar: ");
		double valorSaque = leia.nextDouble();
		cliente.saque(valorSaque);

		System.out.println("\nAccount data: ");
		System.out.println(cliente);

		System.out.println("Obrigado por escolher nosso Banco! =) ");

		leia.close();
	}

}
