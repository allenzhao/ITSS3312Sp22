package demo;

public class LeaseRunner {

	public static void main(String[] args) {
		LeaseInfo l1 = new LeaseInfo("1", "Allen", 1000.0, 0);
		l1.deposit = 300;
		System.out.println(l1.firstPayment());
		System.out.println(l1.getPetFee());
		l1.petCount++;
		System.out.println(l1.secondPayment());
		
	}

}
