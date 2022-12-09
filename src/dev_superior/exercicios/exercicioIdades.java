package dev_superior.exercicios;

import java.util.Scanner;

public class exercicioIdades {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome da primeira pessoa: ");
		String nomeP1 = leia.nextLine();
		
		System.out.println("Digite a idade da primeira pessoa: ");
		int idadeP1 = leia.nextInt();
		
		System.out.println("Digite o nome da segunda pessoa: ");
		String nomeP2 = leia.next();
		
		leia.nextLine();
		System.out.println("Digite a idade da segunda pessoa: ");
		int idadeP2 = leia.nextInt();
		
		double mediaIdade = ((double)idadeP1 + (double)idadeP2) / 2;
		System.out.println("A idade média de "+nomeP1 +" e "+nomeP2 +" é de: "+mediaIdade);;
		
		leia.close();
	}	

}
