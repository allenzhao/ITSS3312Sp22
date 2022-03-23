package demo;

import java.util.Scanner;

/* 
 * Write a method printShampooInstructions(), with int parameter numCycles, and void return type. 
 * If numCycles is less than 1, print "Too few.". If more than 4, print "Too many.". 
 * Else, print "N: Lather and rinse." numCycles times, where N is the cycle number, followed by "Done.". 
 * End with a newline. 
 * 
 * Example output with input 2:
 * 1: Lather and rinse.
 * 2: Lather and rinse.
 * Done.
 * 
 * Hint: Declare and use a loop variable.
 */

public class ShampooMethod {

	/* Your solution goes here */
	public static void printShampooInstructions(int numCycles) {
		int i;
		if (numCycles < 1) {
			System.out.println("Too few.");
		} else if (numCycles > 4) {
			System.out.println("Too many.");
		} else {
			for (i = 1; i <= numCycles; ++i) {
				System.out.println(i + ": Lather and rinse.");
			}
			System.out.println("Done.");
		}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userCycles;

		userCycles = scnr.nextInt();
		printShampooInstructions(userCycles);
	}
}