package entities;

public class Conta {

	private int conta;
	private String nome;
	private double saldo;
	
	
	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public Conta(String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		deposito(depositoInicial);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		saldo -= valorSaque + 5.0;
		System.out.println("Valor da taxa do saque é de $5,00.");
	}
	
	public String toString() {
		return 
			String.format("Conta: "+ conta)
		   +", Nome: "+nome
		   +", Saldo: "
		   +String.format("%.2f ", saldo);
	}
	
}
