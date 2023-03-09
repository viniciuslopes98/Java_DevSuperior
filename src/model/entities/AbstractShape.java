package model.entities;

import model.enums.Colors;

public abstract class AbstractShape implements Shape {

	private Colors color;

	public AbstractShape(Colors color) {
		
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}
	
	
}
