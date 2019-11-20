package P7_1;

import java.util.Date;

public abstract class Decorator implements Employee {

	protected Employee employee;
	public Decorator(Employee employee) {
		this.employee = employee;
	}

	public void start(Date d) {
		this.employee.start(d);
	}
	
	public void terminate(Date d) {
		this.employee.terminate(d);
	}

	public String work() {
		return this.employee.work();
	}
}
