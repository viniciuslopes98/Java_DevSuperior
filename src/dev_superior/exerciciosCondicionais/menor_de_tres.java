package dev_superior.exerciciosCondicionais;

import java.util.Scanner;

public class menor_de_tres {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		System.out.println("Primeiro valor: ");
		int n1 = leia.nextInt();
		
		System.out.println("Segundo valor: ");
		int n2 = leia.nextInt();
		
		System.out.println("Terceiro valor: ");
		int n3 = leia.nextInt();
		
		if (n1 < n2 && n3 > n1) {
			System.out.println("O menor número é: "+ n1);
		}else if (n2 < n1 && n3 > n2) {
			System.out.println("O menor número é: "+ n2);
		}else if(n3 < n1 && n2 > n3) {
			System.out.println("O menor número é: "+ n3);
	    }else if (n1 == n2) {
			System.out.println("O menor número é: "+ n1);
		}else if (n2 == n3) {
			System.out.println("O menor número é: "+ n2);
		}else if (n3 == n1) {
			System.out.println("O menor número é: "+ n1);
		}else
			System.out.println("Valor inválido!");
		
		leia.close();
	}

}
