package demo;

public class ItemManger {

	public static void main(String[] args) {
		GenericItem g1 = new GenericItem();
		g1.setName("123");
		g1.setQuantity(456);
		System.out.println(g1.getName() + g1.getQuantity());
		ProduceItem p1 = new ProduceItem();
		p1.setName("000");
		p1.setQuantity(100);
		System.out.println(p1.getName() + p1.getQuantity());
	}

}
