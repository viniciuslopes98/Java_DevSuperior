package model.entities;

import model.enums.Colors;

public class Circle extends AbstractShape {

	private Double radius;

	public Circle(Colors color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
}
