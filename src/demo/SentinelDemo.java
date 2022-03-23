package demo;
import java.util.Scanner;
public class SentinelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentValue;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Input a list of + numbers, ending with 0");
		currentValue = scnr.nextInt();
		
		int sum = 0;
		int count = 0;
		while (currentValue > 0) {
			sum += currentValue;
			count += 1;
			currentValue = scnr.nextInt();
		}
		System.out.println("Sum is " + sum);
		System.out.println("Avg " + (double)sum / count);
		scnr.close();
	}

}
