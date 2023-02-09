package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double taxa = 0.0;
		double Totaltax = 0.0;
		if (getAnualIncome() < 20000.00) {
			taxa = getAnualIncome() * 0.15;
			Totaltax += taxa - healthExpenditures * 0.50;
		} else
			taxa = getAnualIncome() * 0.25;
			Totaltax += taxa - healthExpenditures * 0.50;

		return Totaltax;
	}

}
