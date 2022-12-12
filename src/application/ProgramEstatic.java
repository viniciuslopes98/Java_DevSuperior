package application;

import java.util.Scanner;

import util.Calculator;

public class ProgramEstatic {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		System.out.println("Enter radius: ");
		double radius = leia.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", Calculator.PI);
		
		
		leia.close();
	}

}
