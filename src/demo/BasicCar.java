package demo;

public class BasicCar {

	   // Total miles driven by the car
	   private int milesDriven;
	   private static String creator = "Zybooks";
	    
	   // Constructor assigns initial values to instance variables
	   public BasicCar() {
	      milesDriven = 0;   
	   }

	   // Drive the requested miles
	   public void drive(int tripMiles) {
	      milesDriven = milesDriven + tripMiles;
	   }

	   // Return total number of miles driven
	   public int checkOdometer() {
	      return milesDriven;
	   }
	   
	   public String toString() {
		   return ""+milesDriven;
	   }
	   
	   public static void print() {
		   System.out.println("Hello!");
	   }

	   // Main() creates objects of type BasicCar and 
	   // calls methods to operate on the objects
	   public static void main(String [] args) {
	      BasicCar redCorvette = new BasicCar();
	      BasicCar fordMustang = new BasicCar();

	      redCorvette.drive(100);        
	      fordMustang.drive(75);
	      fordMustang.drive(300);
	      fordMustang.drive(50);
	      System.out.println(redCorvette);
	      System.out.println(fordMustang);
	      System.out.println();
	   }
	}