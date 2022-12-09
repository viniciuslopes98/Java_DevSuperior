package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;

	}

	public void aumentoSalario(double porcentagem) {
		 salarioBruto += salarioBruto * porcentagem / 100.00;

	}

	public String toString() {
		return "Dados atualizados: " + this.nome + String.format(", $ %.2f", salarioLiquido());
	}

	}
