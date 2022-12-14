package util;

public class Converter {

	public static final double IOF = 6.0;
	
	public static double conversor(double dolar, double qtdDolar) {
		double totalDol = qtdDolar * dolar;
		return totalDol * IOF / 100 + totalDol;
	}
	
	
	
}
