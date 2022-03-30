package demo;

public class Review {
	private int rating;
	private String comment;
	
	Review() {
		this("No comment", -1);
	}
	
	Review(String comment, int rating) {
		this.rating = rating;
		this.comment = comment;
	}
	
	// rating setter/getter
	public int getRating() {
		return this.rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	// comment setter/getter
	public String getComment() {
		return this.comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public void setCommentAndRating(String comment, int rating) {
		this.comment = comment;
		this.rating = rating;
	}
	

}
