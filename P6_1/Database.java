package P6_1;

import java.util.*;

public class Database {
	private Vector<Employee> employees; // Stores the employees
	
	public Database() {
		employees = new Vector<>();
	}
	
	public boolean addEmployee(Employee employee) {
		return employees.add(employee);
	}
	
	public void deleteEmployee(long emp_num) {
		for(Employee e : employees)
			if(e.getEmpNum() == emp_num)
				employees.remove(e);
	}
	
	public Employee[] getAllEmployees() {
		Employee[] e = new Employee[employees.size()];
		for(int i = 0; i < employees.size(); i++)
			e[i] = employees.get(i);
		return e;
	}
}
