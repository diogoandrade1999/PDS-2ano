package P6_1;

import java.util.*;

public class Registos {
	// Data elements
	private ArrayList<Empregado> empregados; // Stores the employees
	
	public Registos() {
		empregados = new ArrayList<>();
	}
	
	public void insere(Empregado emp) {
		empregados.add(emp);
	}
	
	public void remove(int codigo) {
		Empregado emp = null;
		for(Empregado e : empregados)
			if(e.codigo() == codigo) {
				emp = e;
				break;
			}
		empregados.remove(emp);
	}
	
	public boolean isEmpregado(int codigo) {
		for(Empregado e : empregados)
			if(e.codigo() == codigo)
				return true;
		return false;
	}
	
	public List<Empregado> listaDeEmpregados() {
		List<Empregado> emp = new ArrayList<>();
		for(Empregado e : empregados)
			emp.add(e);
		return emp;
	}
}
