package entities;

public class Company extends TaxPayer{

	private int numberOfEmployes;

	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, int numberOfEmployes) {
		super(name, anualIncome);
		this.numberOfEmployes = numberOfEmployes;
	}

	public int getNumberOfEmployes() {
		return numberOfEmployes;
	}

	public void setNumberOfEmployes(int numberOfEmployes) {
		this.numberOfEmployes = numberOfEmployes;
	}

	@Override
	public Double tax() {
		double taxa = 0.0;
		if(numberOfEmployes > 10) {
			taxa += getAnualIncome() * 0.14;
		}else
			taxa += getAnualIncome() * 0.16;
		return taxa;
	}
	
	
}
