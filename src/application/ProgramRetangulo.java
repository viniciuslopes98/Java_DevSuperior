package application;

import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		retangulo.width = leia.nextDouble();
		retangulo.height = leia.nextDouble();
		
		System.out.println("A area do retangulo é de: "+ retangulo.area());
		System.out.println("O perimetro do retangulo é de: "+ retangulo.perimeter());
		System.out.println("A diagonal do retangulo é de: "+ retangulo.diagonal());
		
		leia.close();

	}

}
