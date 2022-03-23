package demo;

public class LeaseInfo {
	// Variables:  apartment number, lessee name, rent, deposit, 
	//             pet count and pet fee
	// Create two methods: 
	//    A method that returns the initial payment
	//    A method that returns other payments
	public String aptNum;
	public String lesseName;
	public double rent;
	public double deposit = 100.0;
	public int petCount;
	private int petFee = 5;
	
	LeaseInfo(String aptNum, String leseeName, double rent, int petCount) {
		this.aptNum = aptNum;
		this.lesseName = leseeName;
		this.rent = rent;
		this.petCount = petCount;
	}
	
	public double firstPayment() {
		return deposit + rent + petCount * petFee;
	}
	
	public double secondPayment() {
		return rent + petCount * petFee;
	}
	
	public int getPetFee() {
		return this.petFee;
	}
	
	public void setPetFee(int petFee) {
		this.petFee = petFee;
	}
}
