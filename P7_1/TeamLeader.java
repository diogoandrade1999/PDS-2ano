package P7_1;

public class TeamLeader extends Decorator {

	public TeamLeader(Employee employee) {
		super(employee);
	}

	public String work() {
		return super.work() + " + TeamLeader";
	}
	
	public void plan() {
		System.out.println("Plan");
	}
}
