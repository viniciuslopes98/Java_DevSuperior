package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product_Exc;
import entities.UsedProduct;

public class Program_Product {

	public static void main(String[] args) throws ParseException {

		Scanner leia = new Scanner(System.in);

		List<Product_Exc> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = leia.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Commom, used or imported (c/u/i)?");
			char x = leia.next().charAt(0);
			if (x == 'c') {
				System.out.print("Name: ");
				leia.nextLine();
				String name = leia.nextLine();
				System.out.print("Price: ");
				Double price = leia.nextDouble();
				list.add(new Product_Exc(name, price));
			} else if (x == 'u') {
				System.out.print("Name: ");
				leia.nextLine();
				String name = leia.nextLine();
				System.out.print("Price: ");
				Double price = leia.nextDouble();
				System.out.print("Digite a data (DD/MM/YYYY): ");
				leia.nextLine();
				String data = leia.nextLine();
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				Date data1 = formato.parse(data);
				list.add(new UsedProduct(name, price, data1));
			} else if (x == 'i') {
				System.out.print("Name: ");
				leia.nextLine();
				String name = leia.nextLine();
				System.out.print("Price: ");
				Double price = leia.nextDouble();
				System.out.print("Customs fee: ");
				Double customsFee = leia.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}

		}
		System.out.println();
		System.out.println("PRICE TAGS");
		for (Product_Exc prod : list) {
			System.out.println(prod.priceTag());

		}

		leia.close();
	}

}
