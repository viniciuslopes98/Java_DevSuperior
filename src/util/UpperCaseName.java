package util;

import java.util.function.Function;

import entities.Productt;

public class UpperCaseName implements Function<Productt, String> {

	@Override
	public String apply(Productt p) {

		return p.getName().toUpperCase();
	}

}
