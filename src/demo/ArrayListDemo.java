package demo;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Double> myArrayList = new ArrayList<Double>();
		myArrayList.add(10.0);
		myArrayList.add(10.1);
		myArrayList.add(10.2);
		//System.out.println(myArrayList.size());
		//System.out.println(myArrayList.get(0));
		myArrayList.set(2, 100.0);
		//System.out.println(myArrayList.get(2));
		int i;
		for (i = 0; i < myArrayList.size(); ++i) {
			System.out.println(myArrayList.get(i));
		}
		for (Double e: myArrayList) {
			System.out.println(e);
		}
	}

}
