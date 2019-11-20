package P7_1;

import java.util.Date;

public class ConcreteEmployee implements Employee {

	private Date start, end;
	private String name;
	
	public ConcreteEmployee(String name) {
		this.name = name;
	}

	public void start(Date d) {
		this.start = d;
	}
	
	public void terminate(Date d) {
		this.end = d;
	}

	public String work() {
		return this.toString();
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ConcreteEmployee [start=" + start + ", end=" + end + ", name=" + name + "]";
	}
}
