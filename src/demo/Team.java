package demo;

public class Team {
	private Person headCoach;
	private Person assistantCoach;
	
	// get/set headCoach
	public Person getHeadCoach() {
		return this.headCoach;
	}
	
	public void setHeadCoach(Person headCoach) {
		headCoach.setName("new name");
		if (headCoach.getType().equals("coach")) {
			this.headCoach = headCoach;
		} else {
			System.out.println("Wrong type for headCoach");
		}
	}
	// get/set assistantCoach;
	public Person getAssistantCoach() {
		return this.assistantCoach;
	}
	
	public void setAssistantCoach(Person assistant) {
		this.assistantCoach = assistant;
	}
	
	public String toString() {
		return "headCoach: " + this.getHeadCoach().getName();
	}

}
