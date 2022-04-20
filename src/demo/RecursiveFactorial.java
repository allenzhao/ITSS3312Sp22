package demo;
import java.util.Scanner;

public class RecursiveFactorial {

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        System.out.println(f(n));
    }
}
