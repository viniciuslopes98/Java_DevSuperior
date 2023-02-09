package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program_TaxPayers {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = leia.nextInt();
		
		for(int i = 1; i <=n;i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)? ");
			char chr = leia.next().charAt(0);
			if(chr =='i') {
				System.out.print("Name: ");
				leia.nextLine();
				String name = leia.nextLine();
				
				System.out.print("Anual income: ");
				double anualIncome = leia.nextDouble();
				
				System.out.print("Health expenditures: ");
				double healthExpenditures = leia.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Name: ");
				leia.nextLine();
				String name = leia.nextLine();
				
				System.out.print("Anual income: ");
				double anualIncome = leia.nextDouble();
				
				System.out.print("Number of employees: ");
				int numberOfEmployees = leia.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for(TaxPayer taxpayers:list) {
			System.out.println(taxpayers.getName()+": $ "+String.format("%.2f", taxpayers.tax()) );
		}
	
		double sum = 0.0;
		for(TaxPayer sumPayers : list) {
			sum += sumPayers.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f",sum);
		leia.close();
	}

}
