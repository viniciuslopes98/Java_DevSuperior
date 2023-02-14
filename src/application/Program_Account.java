package application;

import java.util.Scanner;

import entities.Account_Throws;
import model.exceptions.WithdrawException;

public class Program_Account {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Enter account data");
		
		try {	
			System.out.print("Number: ");
			Integer number = leia.nextInt();
			
			System.out.print("Holder: ");
			leia.nextLine();
			String holder = leia.nextLine();
			
			System.out.print("Initial balance: ");
			double balance = leia.nextDouble();
			
			System.out.println("Withdraw limit: ");
			double withdrawLimit = leia.nextDouble();
			
			Account_Throws acc = new Account_Throws(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double amount = leia.nextDouble();
			System.out.print("Valor de saque solicitado: R$"+amount);
			System.out.println();
			acc.withdraw(amount);
			System.out.print("Novo saldo em conta: R$"+ acc.getBalance());
		}
		catch(WithdrawException e) {
			System.out.println("Falha no saque: "+e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado! Entre em contato conosco através do SAC.");
		}
		
		leia.close();

	}

}
