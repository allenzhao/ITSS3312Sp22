package demo;

import java.util.Scanner;

public class ArrayCalculation {

	public static void main(String[] args) {
		// Calculates the sum and average of user inputs
		int arrayLength;
		Scanner scnr = new Scanner(System.in);
		System.out.println("# of elements:");
		arrayLength = scnr.nextInt();
		int[] myArray = new int[arrayLength];
		int i;
		for (i = 0; i < myArray.length; ++i) {
			System.out.println("Value " + i);
			myArray[i] = scnr.nextInt();
		}
		int sum = 0;
		for (i = 0; i < myArray.length; ++i) {
			sum += myArray[i];
		}
		System.out.println("Sum is " + sum);
		System.out.println("Avg is " + (double)sum / myArray.length);
	}

}
