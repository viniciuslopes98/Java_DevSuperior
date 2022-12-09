package dev_superior.exerciciosCondicionais;

import java.util.Scanner;

public class dardo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite as tres distancias: ");
		double dist1 = leia.nextDouble();
		double dist2 = leia.nextDouble();
		double dist3 = leia.nextDouble();

		if (dist1 > dist2 && dist3 < dist2) {
			System.out.println("A maior distancia foi de: " + dist1);
		} else if (dist3 > dist2) {
			System.out.println("A maior distancia foi de: " + dist3);
		} else {
			System.out.println("A maior distancia foi de: " + dist2);
		}

		leia.close();
	}

}
