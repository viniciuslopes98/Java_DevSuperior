package dev_superior.exerciciosRepeticaoFor;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Deseja a tabuada para qual valor? ");
		int x = leia.nextInt();
		
		
		for(int i=0; i <=10; i++) {
			
			int tabuada = x * i;
			System.out.printf("%d x %d = %d\n", x, i, tabuada);
		}
		
		
		
		leia.close();
	}

}
