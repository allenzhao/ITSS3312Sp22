package demo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LightTravelTime {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double distMiles = 0.0;
		double lightTravelTimeSec = 0.0;

		System.out.print("Enter distance in miles: ");

		boolean flag = true;
		while (flag) {
			try {
				distMiles = scnr.nextDouble();
				flag = false;
				lightTravelTimeSec = distMiles / 186282.0;

			} catch (InputMismatchException e) {
				scnr.next();
				System.out.println("Must enter a number!");
			}
		}

		System.out.println(lightTravelTimeSec);
	}
}