package application;

import java.util.Scanner;

import entities.Pessoa2;

public class Mais_velho {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Quantas pessoas voce vai digitar ? ");
		int n = leia.nextInt();
		
		Pessoa2[] pessoa = new Pessoa2[n];
		String nome;
		int idade,maiorIdade,posicaoMaior;
		for(int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa: ");
			System.out.print("Nome: ");
			leia.nextLine();
			nome = leia.nextLine();
			System.out.print("Idade: ");
			idade = leia.nextInt();
			pessoa[i] = new Pessoa2(nome, idade);
		}
		
		maiorIdade = pessoa[0].getIdade();
		posicaoMaior = 0;
		
		
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getIdade() > maiorIdade) {
				maiorIdade = pessoa[i].getIdade();
				posicaoMaior = i;
			}
			
			
		}
		System.out.printf("PESSOA MAIS VELHA: " + pessoa[posicaoMaior].getNome());
		
		leia.close();
	}

}
