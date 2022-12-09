package exemplos;

import java.util.Scanner;

public class debugCodigo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double largura, comprimento, valor, area, preco;

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();

		area = largura * comprimento;

		System.out.printf("Area do terreno = %.2f\n", area);

		preco = area * valor;

		System.out.printf("Preco do terreno = %.2f\n", preco);

		sc.close();
	}

}
