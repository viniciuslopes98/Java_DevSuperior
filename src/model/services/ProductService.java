package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Productt;

public class ProductService {

	public double filteredSum(List<Productt> list, Predicate<Productt> criteria) {
		double sum = 0.0;
		for (Productt p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
