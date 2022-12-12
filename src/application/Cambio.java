package application;

import java.util.Scanner;

import util.Converter;

public class Cambio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o valor do dólar ? ");
		double dolar = leia.nextDouble();
		
		System.out.println("Quantos dólares serão comprados? ");
		double qtdDolar = leia.nextDouble();
		
		double converte = Converter.conversor(dolar, qtdDolar);
		
		System.out.println("IOF sobre o valor em dólar: "+Converter.IOF+" %");
		System.out.printf("Valor a ser pago em reais: %.2f%n ",converte);
		
		leia.close();

		
		
	}

}
