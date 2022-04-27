package demo;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner scnr = new Scanner(System.in);
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		if (num2 != 0) {
			System.out.println(num1 / num2);
		}
		System.out.println("Bye!");
	}

}
