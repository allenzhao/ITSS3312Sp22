package demo;

import java.util.Scanner;

public class NewReviewSystem {

	public static void main(String[] args) {
		System.out.println("Type rating + comments. To end: -1");
		Scanner scnr = new Scanner(System.in);
		Reviews reviews = new Reviews();
		reviews.inputReviews(scnr);
		
		System.out.println(reviews);
		
	}

}
