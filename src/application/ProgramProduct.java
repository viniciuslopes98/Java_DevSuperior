package application;

import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = leia.nextLine();

		System.out.println("Price: ");
		product.price = leia.nextDouble();

		System.out.println("Quantity in stock: ");
		product.quantity = leia.nextInt();

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
