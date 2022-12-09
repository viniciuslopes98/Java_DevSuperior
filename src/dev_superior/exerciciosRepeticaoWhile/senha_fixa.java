package dev_superior.exerciciosRepeticaoWhile;

import java.util.Scanner;

public class senha_fixa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a senha: ");

		long senha = leia.nextLong();

		while (senha != 2002) {
			System.out.println("Senha Invalida! Tente novamente: ");
			senha = leia.nextLong();
		}

		System.out.println("Acesso permitido!");

		leia.close();
	}

}
