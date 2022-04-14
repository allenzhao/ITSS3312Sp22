package demo;

public class Apartment extends Home {
	public Apartment(double sqft, int numBedrooms, double schoolRating) {
		this.sqft = sqft;
		this.numBedrooms = numBedrooms;
		this.schoolRating = schoolRating;
		setScore();
	}
	
	public void setScore() {
		score = sqft + (numBedrooms * 500) + (schoolRating * 300);
	}

}
