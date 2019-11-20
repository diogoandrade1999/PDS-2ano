package P7_1;

public class TeamMember extends Decorator {

	public TeamMember(Employee employee) {
		super(employee);
	}

	public String work() {
		return super.work() + " + TeamMember";
	}
	
	public void colaborate() {
		System.out.println("Colaborate");
	}
}
