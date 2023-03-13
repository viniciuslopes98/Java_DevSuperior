package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = leia.nextInt();
		
		for(int i = 0; i <n;i++) {
			int value = leia.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First: "+ x);
		
		leia.close();
	}
}
