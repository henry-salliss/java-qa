package inheritancelab;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape{
	public Rectangle(Color colour, Point position, double sideA, double sideB) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	double sideA;
	double sideB;
	

	
	public double getArea() {
		return sideA * sideB;
	}
	
	public double getCircumference() {
		return (sideA * 2) + (sideB * 2);
	}
	
	public void getCharacteristics() {
		System.out.println("colour: " + this.colour);
		System.out.println("position: " + this.position);
		System.out.println("area: " + getArea());
		System.out.println("circumference: " + getCircumference());
	}
}
