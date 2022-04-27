package demo;

import java.util.*;

public class WordScrambler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wordScramble; // User defined word to scramble
		// Prompt user for input
		System.out.print("Enter a word to be scrambled: ");
		wordScramble = sc.next();

		// Call recursive method
		// unchosen letters, already chosen letters
		scrambleLetters(wordScramble, "");
	}

	public static void scrambleLetters(String remainLetters, String chosenLetters) {
		// Todo: Your implementation goes here
		// Hint: Use the removeFromIndex and insertAtIndex helper methods
		if (remainLetters.length() == 0) {
			System.out.println("Base case: " + chosenLetters);
		} else {
			for (int i = 0; i < remainLetters.length(); ++i) {
				String removed = remainLetters.substring(i, i+1);
				remainLetters = removeFromIndex(remainLetters, i);
				chosenLetters += removed;
				
				scrambleLetters(remainLetters, chosenLetters);
				//System.out.println("--------");
				//System.out.println(remainLetters);
				//System.out.println(chosenLetters);
				//System.out.println("--------");
				remainLetters = insertAtIndex(remainLetters, removed, i);
				chosenLetters = removeFromIndex(chosenLetters, chosenLetters.length() - 1);
			}
		}

	}

	public static String removeFromIndex(String origStr, int remLoc) {
		String whatsleft;

		whatsleft = origStr.substring(0, remLoc); // Copy before location remLoc
		whatsleft += origStr.substring(remLoc + 1, origStr.length()); // Copy after location remLoc

		return whatsleft;
	}

	public static String insertAtIndex(String origStr, String insertStr, int addLoc) {
		String finalStr; // local variable to return

		finalStr = origStr.substring(0, addLoc); // Copy before location addLoc
		finalStr += insertStr; // Copy character to location addLoc
		finalStr += origStr.substring(addLoc, origStr.length()); // Copy after location addLoc

		return finalStr;
	}

}