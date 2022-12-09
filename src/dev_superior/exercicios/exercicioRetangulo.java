package dev_superior.exercicios;

import java.util.Scanner;

public class exercicioRetangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do retangulo: ");
		double baseRetangulo = leia.nextDouble();
		
		System.out.println("Digite o valor da altura do retangulo: ");
		double alturaRetangulo = leia.nextDouble();
		
		double area = baseRetangulo * alturaRetangulo;
		double perimetro = (baseRetangulo + alturaRetangulo) * 2;
		double calculo = Math.pow(alturaRetangulo, 2) + (Math.pow(baseRetangulo, 2));
		double diagonal = Math.sqrt(calculo);
		
		System.out.printf("Area do retangulo: %.4f %n", area);
		System.out.printf("Perimetro do retangulo: %.4f %n",perimetro);
		System.out.printf("Diagonal do retangulo: %.4f",diagonal);
		
		leia.close();
	}

}
