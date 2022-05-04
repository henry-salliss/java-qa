package inheritancelab;

import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle{

	public Sphere(Color colour, Point position, double radius) {
		super(colour, position, radius);
	}

	public double getVolume() {
		return (4/3 * Math.PI) * this.radius * this.radius * this.radius;
	}
	
	public void printCharacteristics() {
		System.out.println("colour: " + this.colour);
		System.out.println("position: " + this.position);
		System.out.println("radius: " + this.radius);
		System.out.println("circumference: " + this.getCircumference());
		System.out.println("diameter: " + this.getDiameter());
		System.out.println("area: " + this.getArea());
		System.out.println("volume: " + getVolume());
	}
}
