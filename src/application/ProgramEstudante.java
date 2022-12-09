package application;

import java.util.Scanner;

import entities.Estudante;

public class ProgramEstudante {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Estudante aluno = new Estudante();
		
		System.out.println("Nome: ");
		aluno.nome = leia.nextLine();

		
		System.out.println("Primeira nota: ");
		aluno.nota1 = leia.nextDouble();
		
		System.out.println("Segunda nota: ");
		aluno.nota2 = leia.nextDouble();
		
		System.out.println("Terceira nota: ");
		aluno.nota3 = leia.nextDouble();
		
		
		aluno.calculoNota();
		
		
		
		leia.close();

	}

}
