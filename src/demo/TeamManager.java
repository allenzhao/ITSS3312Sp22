package demo;

public class TeamManager {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.setAge(20);
//		p1.setName("Allen");
//		p1.setType("coach");
//		System.out.println(p1);
//		Team t1 = new Team();
//		t1.setHeadCoach(p1);
//		System.out.println(p1);
		Integer i1 = 127;
		Integer i2 = Integer.valueOf(127);
		//i2 = 1 + 1;
		if (i1 == i2) {
			System.out.println("Yes for ==");
		} else if (i1.equals(i2)) {
			System.out.println("Should use .equals()!");
		} else {
			System.out.println("Not equal");
		}
	}

}
