package util;

import java.util.function.Predicate;

import entities.Productt;

public class ProductPredicate implements Predicate<Productt>{

	@Override
	public boolean test(Productt p) {
		
		return p.getPrice() >= 100.0;
		
	}

}
