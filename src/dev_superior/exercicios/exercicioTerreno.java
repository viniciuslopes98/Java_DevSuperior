package dev_superior.exercicios;

import java.util.Scanner;

public class exercicioTerreno {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = leia.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento = leia.nextDouble();
		System.out.println("Digite o valor do m²: ");
		double metroQuadrado = leia.nextDouble();
		
		double areaTerreno = largura * comprimento;
		double precoTerreno = areaTerreno * metroQuadrado;
		
		System.out.println("A área do terreno é de: "+areaTerreno);
		System.out.println("O valor do terreno é: "+ precoTerreno);
		
		leia.close();
	}

}
