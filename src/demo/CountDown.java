package demo;

public class CountDown {
	
	public static void countDownTimer (int countInt) {
		if (countInt <= 0) {
			System.out.println("GO!");
		} else if (countInt == 1) {
			System.out.println("One second left");
			System.out.println("GO!");
		} else {
			System.out.println(countInt);
			countDownTimer(countInt - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDownTimer(1);
	}

}
