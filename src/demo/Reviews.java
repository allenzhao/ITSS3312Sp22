package demo;

import java.util.Scanner;
import java.util.ArrayList;

public class Reviews {
	private ArrayList<Review> reviews = new ArrayList<Review>();

	public void inputReviews(Scanner scnr) {
		this.inputReviews(scnr, -1);
	}

	public void inputReviews(Scanner scnr, int sentValue) {
		int rating = scnr.nextInt();
		while (rating != sentValue) {
			scnr.nextLine(); //Important: required when the input of String is in a new line than the int. 
			String comment = scnr.nextLine();
			Review reviewToAdd = new Review(comment, rating);
			reviews.add(reviewToAdd);
			rating = scnr.nextInt();
		}
	}

	public String toString() {
		String toReturn = "";
		for (Review review : reviews) {
			toReturn += "Rating: " + review.getRating() + ". Comment: "+review.getComment() + "\n";
		}
		// alternatively:
		return toReturn;
	}
	
	public void printReviews() {
		System.out.println(this.reviews);
	}
	
	public void printReviews(int rating) {
		for (Review review : reviews) {
			if(review.getRating() == rating) {
				System.out.println(review);
			}
		}
	}
	// Some more method overloading
	public void printReviews(Scanner scnr) {
		printReviews(scnr, -1);
	}
	
	public void printReviews(Scanner scnr, int sentValue) {
		int rating = scnr.nextInt();
		while (rating != sentValue) {
			for (Review review : reviews) {
				if(review.getRating() == rating) {
					System.out.println(review);
				}
			}
		}
	}
}
