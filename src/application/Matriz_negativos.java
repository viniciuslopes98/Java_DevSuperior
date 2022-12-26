package application;

import java.util.Scanner;

public class Matriz_negativos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o tamanho da matriz: ");
		int n = leia.nextInt();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int x = 0; x < matriz[i].length; x++) {
				matriz[i][x] = leia.nextInt();

			}
		}
		
		System.out.println("Valores na diagonal: ");
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i]+" ");
			
		}
		System.out.println();
		
		int negativos = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int x = 0; x < matriz[i].length; x++) {
				if (matriz[i][x] < 0) {
					negativos++;
				}

			}
		}
		
		System.out.println("Numeros negativos: "+negativos);
		
		leia.close();

	}

}
