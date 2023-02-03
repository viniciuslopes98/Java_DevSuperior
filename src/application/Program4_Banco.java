package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program4_Banco {

	public static void main(String[] args) {
		
//		O tipo Account(conta comum)  não pode ser instanciado pois foi definido
//		como classe abstrata, portanto tornou-se uma herança total(somente as classes
//		filhas podem ser instanciadas).
//		
//		Account acc1 = new Account(1001, "Alex", 1000.0);
		
		
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1002,"Maria", 1000.0, 0.01));
		list.add(new BusinessAccount(1003, "Bob",1000.0 , 500.0));
		list.add(new SavingsAccount(1001,"Alex", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Vini",600.0 , 800.0));
		
		double soma = 0.0;
		for(Account acc : list) {
			soma += acc.getBalance();
		}
		
		System.out.println("Total balance: "+soma);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.println("Updated balance for account: "+acc.getNumber()+" - "+acc.getBalance());
		}
		
	}

}
