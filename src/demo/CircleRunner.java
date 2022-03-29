package demo;
import java.util.ArrayList;
public class CircleRunner {

	public static void main(String[] args) {
		ArrayList<Circle> circles = new ArrayList<Circle>();
		Circle c1 = new Circle(1.0);
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle(); // 0.0 
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		Circle circleToChange = new Circle(10000000.0);
		int i = 0;
		for (i = 0; i < circles.size(); ++i) {
			System.out.println(circles.get(i));
		}
//		for (i = 0; i < circles.size(); ++i ) {
//			circles.set(i, circleToChange);
//		}
		for (Circle loop: circles) {
		loop.setRadius(10000000.0);
		}
		for (i = 0; i < circles.size(); ++i) {
			System.out.println(circles.get(i));
		}

	}
}
