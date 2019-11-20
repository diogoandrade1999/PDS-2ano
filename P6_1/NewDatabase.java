package P6_1;

import java.util.List;

public class NewDatabase extends Database {

	private Registos legacyDB;
	
	public NewDatabase(Registos legacyDB) {
		this.legacyDB = legacyDB;
	}
	
	public boolean addEmployee(Employee employee) {
		return super.addEmployee(employee);
	}
	
	public boolean addEmployee(Empregado empregado) {
		if(this.legacyDB != null)
			this.legacyDB.insere(empregado);
		return true;
	}
	
	public void deleteEmployee(long emp_num) {
		super.deleteEmployee(emp_num);
		if(this.legacyDB != null)
			this.legacyDB.remove((int)emp_num);
	}
	
	public boolean isEmployee(long emp_num) {
		for(Employee e : super.getAllEmployees())
			if(e.getEmpNum() == emp_num)
				return true;
		if(this.legacyDB != null)
			return this.legacyDB.isEmpregado((int)emp_num);
		return false;
	}
	
	public Employee[] getAllEmployees() {
		Employee[] e1 = super.getAllEmployees();
		List<Empregado> e2 = this.legacyDB.listaDeEmpregados();
		int size1 = e1.length;
		int size2 = e2.size();
		Employee[] emp = new Employee[size1 + size2];
		
		int index = 0;
		if(this.legacyDB != null)
			for(Empregado e : e2) {
				Employee em = new Employee(e.nome() + " " + e.apelido(), e.codigo(), e.salario());
				emp[index] = em;
				index++;
			}
		
		for(Employee e : e1) {
			emp[index] = e;
			index++;
		}
		return emp;
	}
}
