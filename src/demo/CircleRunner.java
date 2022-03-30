package demo;

import java.util.ArrayList;
import java.util.Random;

public class CircleRunner {

	public static void main(String[] args) {
		ArrayList<Circle> circles = new ArrayList<Circle>();
		Circle c1 = new Circle(1.0);
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle(); // 0.0
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		System.out.println("Confirm ArrayList after add:");
		for (Circle c : circles) {
			System.out.println(c);
		}
		int i;
		for (i = 0; i < circles.size(); ++i) {
			Circle toChanage = new Circle((double) i + 5);
			circles.set(i, toChanage); // works, changes circles.
		}
		System.out.println("After regular for loop & set:");
		for (Circle c : circles) {
			System.out.println(c);
		}
		System.out.println("Retry set using enhanced for loop:");
		for (Circle loop : circles) {
			Circle circleToChange = new Circle(500.0);
			loop = circleToChange; // not working!
		}
		for (Circle c : circles) {
			System.out.println(c);
		}
		for (Circle loop : circles) {
			double newR = new Random().nextDouble()*10;
			loop.setRadius(newR); // works, change circles!
		}
		System.out.println("Confirm calling member worked:");
		for (Circle c : circles) {
			System.out.println(c);
		}

	}
}
