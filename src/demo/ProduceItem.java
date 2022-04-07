package demo;

public class ProduceItem extends GenericItem{
	private String expirationDate;
	
	ProduceItem() {
		super();
		expirationDate = "today";
	}
	
	public void setExpiration(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String getExpiration() {
		return this.expirationDate;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ". Expiration: " + expirationDate;
	}
}

