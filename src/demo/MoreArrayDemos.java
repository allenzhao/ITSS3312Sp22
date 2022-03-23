package demo;

public class MoreArrayDemos {

	public static void main(String[] args) {
		int[] myArray = {8, 13, 16, 7, 5, 1, 0, 55};
		// Demo1: Determining the minimum/maximum number in the array
		int min = myArray[0];
		int i;
		for (i = 1; i < myArray.length; ++i) {
			if (myArray[i] < min) {
				min = myArray[i];
			}
		}
		System.out.println(min);
		// Demo2: Counting the odd numbers in the array
		int count = 0;
		for (i = 0; i < myArray.length; ++i) {
			if (myArray[i] % 2 == 1) {
				++count;
			}
		}
		System.out.println(count);
		int[] secondArray;

//		int[] secondArray = {8, -13, 16, -7, 5, -1, 0, 55};
//		
//		for (i = 0; i < secondArray.length; ++i) {
//			secondArray[i] = Math.abs(secondArray[i]);
//		}
//		for (i = 0; i < secondArray.length; ++i) {
//			System.out.print(secondArray[i] + " ");
//		}
		// Demo3: Copying an array
		secondArray = myArray;
		System.out.println(secondArray[secondArray.length - 1]);
		secondArray[secondArray.length - 1] = 1000;
		System.out.println(myArray[myArray.length - 1]);

	}

}
