package demo;

public class ItemManger {

	public static void main(String[] args) {
		GenericItem g1 = new GenericItem();
		g1.setName("Generic");
		g1.setQuantity(456);
		System.out.println(g1.getDescription());
		ProduceItem p1 = new ProduceItem();
		p1.setName("Produce");
		p1.setQuantity(100);
		p1.setExpiration("Expired already!!!!");
		System.out.println(p1.getDescription());
		ProduceItem p2 = new ProduceItem();
		System.out.println(p2.getDescription());
	}

}
