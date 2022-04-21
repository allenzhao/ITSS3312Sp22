package demo;

import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Print game objective, user input commands
		System.out.println("Choose a number from 0 to 100.");
		System.out.println("Answer with:");
		System.out.println("   l (your num is lower)");
		System.out.println("   h (your num is higher)");
		System.out.println("   any other key (guess is right).");

		// Call recursive function to guess number
		guessNumber(0, 100, scnr);
	}

	public static void guessNumber(int lowVal, int highVal, Scanner scnr) {
		int mid = (lowVal + highVal) / 2;
		char ans;
		System.out.println("Is the number " + mid + "? l for low, h for high and y for yes");
		ans = scnr.next().charAt(0);
		if ((ans != 'h') && (ans != 'l')) {
			System.out.println("Thx, I win");
		} else {
			if (ans == 'l') {
				guessNumber(lowVal, mid, scnr);
			} else {
				guessNumber(mid + 1, highVal, scnr);
			}
		}
		
	}
}