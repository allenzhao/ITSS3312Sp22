package demo;
import java.util.*;

public class ShoppingCombination {
	public static final int Max_ShoppingBag = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<GroceryItem> possibleItems = new ArrayList<GroceryItem>();
		ArrayList<GroceryItem> currentBag = new ArrayList<GroceryItem>();
		for (int i = 1; i <= 4; ++i) {
			GroceryItem tmpGroceryItem = new GroceryItem();
			System.out.print("Item " + i + ": ");
			tmpGroceryItem.itemName = sc.next();
			System.out.print("Item " + i + " price: ");
			tmpGroceryItem.price = sc.nextInt();
			possibleItems.add(tmpGroceryItem);
		}
		shoppingBagCombinations(currentBag, possibleItems);
	}

	public static void shoppingBagCombinations(ArrayList<GroceryItem> currBag, ArrayList<GroceryItem> remainingItems) {
		GroceryItem temp;
		if (currBag.size() == Max_ShoppingBag) {
			int totalVal = 0;
			for (GroceryItem item: currBag) {
				System.out.println(item);
				totalVal += item.price;
			}
			System.out.println(totalVal);
		} else {
			for (int i = 0; i < remainingItems.size(); ++i) {
				temp = remainingItems.get(i);
				remainingItems.remove(i);
				currBag.add(temp);
				
				shoppingBagCombinations(currBag, remainingItems);
				remainingItems.add(i, temp);
				currBag.remove(currBag.size() - 1);
			}
		}
	}
}