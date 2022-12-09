package dev_superior.exercicios;

import java.util.Scanner;

public class exercicioTroco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		System.out.println("Preço unitário do produto: ");
		double precoUn = leia.nextDouble();
		
		System.out.println("Quantidade comprada: ");
		int qtdCompra = leia.nextInt();
		
		System.out.println("Dinheiro recebido: ");
		double pagamento = leia.nextDouble();
		
		double troco = pagamento - (precoUn * qtdCompra) ; 
		
		System.out.println("O troco da compra é de: "+troco);
		
		leia.close();
	}

}
