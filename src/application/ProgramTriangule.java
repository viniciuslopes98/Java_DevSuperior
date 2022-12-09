package application;

import java.util.Scanner;

import entities.Triangule;

public class ProgramTriangule {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Triangule x, y;
		
		x = new Triangule();
		y = new Triangule();
		
		System.out.println("Enter the measures of triangule X: ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		
		System.out.println("Enter the measures of triangule Y: ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangule X area: %.4f%n",areaX);
		System.out.printf("Triangule Y area: %.4f%n",areaY);
		
		if ( areaX > areaY) {
			
			System.out.println("Larger area: X");
		}else {
			
			System.out.println("Larger area: Y");
		}
		
		
		leia.close();

	}

}
