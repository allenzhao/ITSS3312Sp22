package demo;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	// FINISH: Define celsiusToFahrenheit method here
	public static double celsiusToFahrenheit(double tempinC) {
		double tempinF;
		tempinF = tempinC * 9 / 5 + 32;
		return tempinF;
	}
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double tempF;
		double tempC;

		System.out.println("Enter temperature in Celsius: ");
		tempC = scnr.nextDouble();

		tempF = celsiusToFahrenheit(tempC); // FIXME

		System.out.print("Fahrenheit: ");
		System.out.println(tempF);
	}
	
}
