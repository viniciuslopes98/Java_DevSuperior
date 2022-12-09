package entities;

public class Estudante {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public void calculoNota() {
		double somaNotas = nota1 + nota2 + nota3;
		System.out.println("Nota final: "+somaNotas);
		if(somaNotas >= 60.0) {
			System.out.println("APROVADO!");
		}else {
			System.out.println("REPROVADO!");
			double faltaNota = 60.0 - somaNotas;
			System.out.println("Faltam "+faltaNota+" pontos para você passar! ");
		}
			
		
	}
	
	
	
}
