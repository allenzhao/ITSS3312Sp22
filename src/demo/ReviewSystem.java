package demo;
import java.util.*;

public class ReviewSystem {

	public static void main(String[] args) {
		ArrayList<Review> reviews = new ArrayList<Review>();
		System.out.println("Type rating, then comments. To end: -1");
		Scanner scnr = new Scanner(System.in);
		int rating = scnr.nextInt();
		while (rating != -1) {
			scnr.nextLine(); // newline
			String comment = scnr.nextLine();
			Review reviewToAdd = new Review(comment, rating);
			reviews.add(reviewToAdd);
			rating = scnr.nextInt();
		}
		System.out.println("Type rating to view. To end: -1");
		rating = scnr.nextInt();
		while (rating != -1) {
			for (Review review : reviews) {
				if(review.getRating() == rating) {
					System.out.println(review);
				}
			}
			System.out.println("Type rating to view. To end: -1");
			rating = scnr.nextInt();
		}

		
	}

}
