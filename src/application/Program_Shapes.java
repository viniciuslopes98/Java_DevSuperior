package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Square;
import model.enums.Colors;

public class Program_Shapes {

	public static void main(String[] args) {
		
		AbstractShape s1 = new Circle(Colors.BLACK, 2.0);
		AbstractShape s2 = new Square(Colors.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: "+ s1.getColor());
		System.out.println("Circle area: "+ String.format("%.3f", s1.area()));
		System.out.println("Square color: "+s2.getColor());
		System.out.println("Square area: "+ String.format("%.3f", s2.area()));
	}

}
