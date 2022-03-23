package demo;

public class Circle {
	private double radius;
	public final static double PI = 3.14;
	
	Circle() {
		//this(0.0);
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double demo() {
		return 1.0;
	}
	
	public static double getDiameter(double myRadius) {
		return 2 * myRadius;
	}
	
	public static double getCircumfence(double myRadius) {
		return 2 * PI * myRadius;
	}
	
	public String toString() {
		return "Circle: \n   Radius:" + this.radius;
	}
	
}
