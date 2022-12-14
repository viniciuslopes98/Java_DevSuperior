package application;

import java.util.Scanner;

import entities.Product2;

public class ProgramProduct2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = leia.nextLine();

		System.out.println("Price: ");
		double price = leia.nextDouble();

		Product2 product = new Product2(name, price);
		
		System.out.println("\nProduct data: "+ product+"\n");
		
		System.out.println("Entry the number of products to be added in stock: ");
		int quantity = leia.nextInt();
		product.addProducts(quantity);
		
		System.out.println("\nUpdated data: "+ product);
		
		System.out.println("\nEntry the number of products to be removed from stock: ");
		quantity = leia.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("\nUpdated data: "+ product);
		
		leia.close();

	}

}
