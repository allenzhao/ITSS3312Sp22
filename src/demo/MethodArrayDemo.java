package demo;

import java.util.Scanner;

public class MethodArrayDemo {
	
	public static int add(int a, int b) {
		a = 10;
		b = 5;
		return a + b;
	}

   public static void reverseVals(int[] arrVals) {
      int i;             // Loop index
      int tempValue;
      for (i = 0; i < (arrVals.length / 2); ++i) {
         tempValue = arrVals[i]; // Do swap
         arrVals[i] = arrVals[arrVals.length - 1 - i];
         arrVals[arrVals.length - 1 - i] = tempValue;
      }
      // IMPORTANT: arrVals = something would not change what's inside arrVals!!!!
   }

   public static void main(String[] args) {
	   int x = 15;
	   int y = 20;
	   System.out.println(add(x, y));
	   System.out.println(x);
	   System.out.println(y);
//      Scanner scnr = new Scanner(System.in);
//      final int NUM_VALUES = 8;              // Array size
//      int[] userVals = new int[NUM_VALUES];  // User values
//      int i;                                 // Loop index
//
//      // Prompt user to populate array
//      System.out.println("Enter " + userVals.length + " values...");
//      for (i = 0; i < userVals.length; ++i) {
//         System.out.print("Value:  ");
//         userVals[i] = scnr.nextInt();
//      }
//
//      // Call method to reverse array values
//      reverseVals(userVals);
//
//      // Print updated arrays
//      System.out.print("\nNew values: ");
//      for (i = 0; i < userVals.length; ++i) {
//         System.out.print(userVals[i] + " ");
//      }
//      System.out.println();
   }
}
