package demo;

public class TeamManager {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Allen");
		p1.setType("coach");
		System.out.println(p1);
		Team t1 = new Team();
		t1.setHeadCoach(p1);
		System.out.println(p1);

	}

}
