package inheritancelab;

import java.awt.Color;
import java.awt.Point;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(Color.black, null, 5, 10);
		r1.getCharacteristics();
		Circle c1 = new Circle(Color.cyan, null, 13);
		c1.printCharacteristics();
		Sphere s1 = new Sphere(Color.LIGHT_GRAY, null, 35);
		s1.printCharacteristics();
	}

}
