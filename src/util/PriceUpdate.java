package util;

import java.util.function.Consumer;

import entities.Productt;

public class PriceUpdate implements Consumer<Productt> {

	@Override
	public void accept(Productt p) {

		p.setPrice(p.getPrice() * 1.1);

	}

}
