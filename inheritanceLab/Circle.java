package inheritancelab;

import java.awt.Color;
import java.awt.Point;
import java.lang.Math;

public class Circle extends Shape{
	double radius;
	
	public Circle(Color colour, Point position, double radius) {
		super(colour, position);
		this.radius = radius;
	}
	
	public double getArea() {
	double num = (Math.PI * radius);
	return Math.pow(num, 2);
		
	}
	
	public double getCircumference() {
		return (Math.PI * radius) * 2;
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void printCharacteristics() {
		System.out.println("colour: " + this.colour);
		System.out.println("position: " + this.position);
		System.out.println("radius: " + radius);
		System.out.println("circumference: " + getCircumference());
		System.out.println("diameter: " + getDiameter());
		System.out.println("area: " + getArea());
	}
}
