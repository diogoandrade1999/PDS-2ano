package P7_1;

public class Manager extends Decorator {

	public Manager(Employee employee) {
		super(employee);
	}

	public String work() {
		return super.work() + " + Manager";
	}
	
	public void manage() {
		System.out.println("Manage");
	}
}
