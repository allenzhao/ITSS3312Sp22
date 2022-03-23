package demo;

public class StatsInfoTest {
	   public static void main(String[] args) {
	      StatsInfo testData = new StatsInfo();

	      // Typical test bench tests more thoroughly
	      int testPassed;
	      final int totalTests = 4;

	      System.out.println("Beginning tests.");
	      testPassed = 0;

	      // Check set/get num1
	      testData.setNum1(100);
	      if (testData.getNum1() != 100) {
	         System.out.println("   FAILED set/get num1");
	      } else {
	    	  ++testPassed;
	      }

	      // Check set/get num2
	      testData.setNum2(50);
	      if (testData.getNum2() != 50) {
	         System.out.println("   FAILED set/get num2");
	      } else {
	    	  ++testPassed;
	      }

	      // Check getAverage()
	      testData.setNum1(10);
	      testData.setNum2(20);
	      if (testData.getAverage() != 15) {
	         System.out.println("   FAILED GetAverage for 10, 20");
	      } else {
	    	  ++testPassed;
	      }

	      testData.setNum1(-10);
	      testData.setNum2(0);
	      if (testData.getAverage() != -5) {
	         System.out.println("   FAILED GetAverage for -10, 0");
	      } else {
	    	  ++testPassed;
	      }

	      System.out.println("Tests complete" + "\nTest passed: " + testPassed + "/"+totalTests);
	   }
	}
