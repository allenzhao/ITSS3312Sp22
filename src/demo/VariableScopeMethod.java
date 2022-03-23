package demo;

import java.util.Scanner;

public class VariableScopeMethod {
   final static double CM_PER_IN = 2.54;
   final static int IN_PER_FT = 12;

   /* Converts a height in feet/inches to centimeters */
   public static double heightFtInToCm(int heightFt, int heightIn) {
      int totIn;
      double cmVal;

      totIn = (heightFt * IN_PER_FT) + heightIn; // Total inches
      cmVal = totIn * CM_PER_IN;                 // Conv inch to cm
      return cmVal;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userFt;      // User defined feet
      int userIn;      // User defined inches

      // Prompt user for feet/inches
      System.out.print("Enter feet: ");
      userFt = scnr.nextInt();

      System.out.print("Enter inches: ");
      userIn = scnr.nextInt();

      // Output the conversion result
      System.out.print("Centimeters: ");
      System.out.println(heightFtInToCm(userFt, userIn));
   }
}