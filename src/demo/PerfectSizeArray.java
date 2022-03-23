package demo;


public class PerfectSizeArray {
	// Create a method called fill, pass in an array reference and an integer, 
	// fill the arrays' elements with the initialized value
	public static void fill(int[] arrRef, int val) {
		int i;
		for (i = 0; i < arrRef.length; ++i) {
			arrRef[i] = val;
		}
	}

	public static void main(String[] args) {
		int[] myArray = new int[10];
		int i;
		for (i = 0; i < 10; ++i) {
			System.out.println(myArray[i]);
		}
		fill(myArray, 100);
		for (i = 0; i < 10; ++i) {
			System.out.println(myArray[i]);
		}
	}
}
