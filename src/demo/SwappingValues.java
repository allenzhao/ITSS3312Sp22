package demo;

public class SwappingValues {
	public static void main(String[] args) {
		int[] myArray = {2, 7, 6, 9, 8};

		int i;
		int temp;
		for (i = 0; (i < myArray.length / 2); ++i) {
			temp = myArray[i];
			myArray[i] = myArray[myArray.length - 1 - i];
			myArray[myArray.length - 1 - i] = temp;
		}
		for (i = 0; i <myArray.length; ++i) {
			System.out.print(myArray[i] + " ");
		}
		
	}
}
