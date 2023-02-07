package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program_abstract {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = leia.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #"+i+" data:");
			System.out.print("Rectangle or Circle (r/c) ?");
			char ch = leia.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(leia.next());
			if (ch == 'r') {
				System.out.println("Width: ");
				double width = leia.nextDouble();
				System.out.println("Height: ");
				double height = leia.nextDouble();
				list.add(new Rectangle(color, width, height));
			}else {
				System.out.println("Radius: ");
				double radius = leia.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println();
		System.out.print("SHAPE AREAS: ");
		
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
		
		leia.close();
	}

}
