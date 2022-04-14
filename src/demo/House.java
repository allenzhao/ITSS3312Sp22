package demo;

public class House extends Home implements Tax, Asset {
	private double taxes;
	private double appreciation;
	private double appraisedValue;
	
	public House(double sqft, int numBedrooms, double schoolRating, double appraisedValue) {
		this.sqft = sqft;
		this.numBedrooms = numBedrooms;
		this.schoolRating = schoolRating;
		this.appraisedValue = appraisedValue;
		setAppreciation();
		setTaxes();
		setScore();
	}

	@Override
	public void setAppreciation() {
		// TODO Auto-generated method stub
		appreciation = appraisedValue * APPREC_RATE;
	}

	@Override
	public void setTaxes() {
		// TODO Auto-generated method stub
		taxes = appraisedValue * TAX_RATE;
		
	}

	@Override
	public void setScore() {
		// TODO Auto-generated method stub
		score = sqft + (numBedrooms * 500) + (schoolRating * 500) + appreciation - taxes;
	}

}
