package dev_superior.exerciciosCondicionais;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double primeiraNota = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double segundaNota = leia.nextDouble();
		
		double somaNota = primeiraNota + segundaNota;
		
		if (somaNota < 60) {
			System.out.println("REPROVADO!");
		}else {
			System.out.println("Parabéns! Você foi aprovado!!");
		}
		
		System.out.println("\n \t\t Sua nota: "+somaNota);
		
		leia.close();

	}

}
