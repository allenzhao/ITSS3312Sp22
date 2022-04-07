package demo;

public class GenericItem {
	private int itemQuantity;
	private String itemName;
	
	GenericItem() {
		itemQuantity = 1;
		itemName = "None";
	}
	
	public void setQuantity(int quantity) {
		itemQuantity = quantity;
	}
	
	public int getQuantity() {
		return this.itemQuantity;
	}
	
	public void setName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getName() {
		return this.itemName;
	}
	
	public String getDescription() {
		return this.itemName + "@" + this.itemQuantity;
	}
}
