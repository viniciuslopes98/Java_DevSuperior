package application;

import java.util.Comparator;

import entities.Productt;

public class MyComparator implements Comparator<Productt> {

	@Override
	public int compare(Productt p1, Productt p2) {
		
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
				
	}

	
}
