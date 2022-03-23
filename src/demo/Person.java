package demo;

public class Person {
	private String name;
	private int age;
	private String type; // player/coach

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
		return "Name: " + this.name + "; Age: " + this.age;
	}
	
}
