package demo;

public class Person {
	private String name;
	private int age;
	private String type; // player/coach
	
	public Person() {
		this("none", 20, "player");
	}
	
	public Person(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.setType(type);
	}
	
	public Person(String name, int age) {
		this(name, age, "player");
	}
	
	public void setType(String type) {
		if (type.equals("player") || type.equals("coach")) {
			this.type = type;
		} else {
			System.out.println("Wrong type, expected player/coach, got" + type);
		}
	}
	
	public String getType() {
		return this.type;
	}

	// get/set name
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	// get/set age
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	// get/set type
	// toString();
	public String toString() {
		return "Name: " + this.name + "; Age: " + this.age + "; Type: " + this.type;
	}
	
}
