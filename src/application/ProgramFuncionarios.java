package application;

import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionarios {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.nome = leia.nextLine();
		
		System.out.println("Salario Bruto: ");
		funcionario.salarioBruto = leia.nextDouble();
		
		System.out.println("Imposto: ");
		funcionario.imposto = leia.nextDouble();
		
		System.out.println("Funcionario "+funcionario.nome+", $ "+funcionario.salarioLiquido());
		
		System.out.println("Qual a porcentagem para aumentar o salário ?");
		double porcentagem = leia.nextDouble();
		funcionario.aumentoSalario(porcentagem);
		
		System.out.println(funcionario);
		
		leia.close();

	}

}
