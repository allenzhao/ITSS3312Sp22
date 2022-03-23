package demo;

public class OversizedArrayDemo {

	public static void printOversizeArray(String[] arrayRef, int arraySize) {
		int index;

		System.out.print("[");
		for (index = 0; index < arraySize; ++index) {
			System.out.print(arrayRef[index]);
			if (index != arraySize - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static int addElement(String[] arrayRef, int currentSize, String addMe) {
		// TODO: implementation
		if (arrayRef.length > currentSize) {
			arrayRef[currentSize] = addMe;
			++currentSize;
			return currentSize;
		} else {
			return currentSize; // Do nothing
		}

	}

	public static int removeFirst(String[] arrayRef, int arraySize, String targetVal) {
		// TODO: implementation
		int i;
		boolean found = false;
		for (i = 0; i < arraySize; ++i) {
			if (found) {
				arrayRef[i - 1] = arrayRef[i];
			}
			if (!found && arrayRef[i].equals(targetVal)) {
				found = true;
			}
		}
		if (found) {
			--arraySize;
		}
		return arraySize;

	}

	public static void main(String[] args) {

		final int LIST_SIZE = 20;
		String[] toDoList = new String[LIST_SIZE];
		int toDoListSize = 0;
		printOversizeArray(toDoList, toDoListSize);
		toDoListSize = addElement(toDoList, toDoListSize, "Eat");
		printOversizeArray(toDoList, toDoListSize);
		toDoListSize = addElement(toDoList, toDoListSize, "Hat");
		printOversizeArray(toDoList, toDoListSize);
		toDoListSize = addElement(toDoList, toDoListSize, "Eat");
		printOversizeArray(toDoList, toDoListSize);
		toDoListSize = addElement(toDoList, toDoListSize, "Love");
		printOversizeArray(toDoList, toDoListSize);
		toDoListSize = addElement(toDoList, toDoListSize, "Eat");
		printOversizeArray(toDoList, toDoListSize);
		toDoListSize = removeFirst(toDoList, toDoListSize, "Eat");
		printOversizeArray(toDoList, toDoListSize);

	}

}
