package demo;

public class PizzaCalories {

	// First, calculate the circle area given its diameter
	public static double calcArea(double diameter) {
		double area;
		final double PI = 3.1415;
		area = Math.pow((diameter), 2) * PI;
		return area;
	}
	
	// Then, calculate its calories. Calories per square inch: 16.7
	public static double calcCalories(double diameter) {
		final double CPI = 16.7;
		double calories;
		calories = CPI * calcArea(diameter);
		return calories;
	}
	
	public static void main(String[] args) {
		System.out.println(calcCalories(20.0));
	}

}
