package dev_superior.exercicios;

import java.util.Scanner;

public class exercicioPagamento {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Nome do funcionário: ");
		String nomeFuncionario = leia.nextLine();
		
		System.out.println("Valor por hora: ");
		double valorHora = leia.nextDouble();
		
		System.out.println("Horas trabalhadas: ");
		double horasTrabalhadas = leia.nextDouble();
		
		double pagamento = valorHora * horasTrabalhadas;
		
		System.out.printf("O pagamento para %s deve ser %.2f",nomeFuncionario,pagamento);
		
		
		leia.close();

	}

}
