package demo;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		double initialAmount;
		double interestRate;
		double currentAmount;
		
		System.out.println("Intital amount");
		Scanner scnr = new Scanner(System.in);
		initialAmount = scnr.nextDouble();
		System.out.println("Interest rate");
		interestRate = scnr.nextDouble();
		scnr.close();
		int i;
		currentAmount = initialAmount;
		for (i = 0; i < 10; ++i) {
			currentAmount = currentAmount + currentAmount * interestRate;
			System.out.println("Current amount is " + currentAmount);
		}

	}

}
