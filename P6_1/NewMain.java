package P6_1;

public class NewMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ana", 1 , 900);
		Employee e2 = new Employee("Carlos", 2 , 800);
		Empregado e3 = new Empregado("Maria", "Magalhães", 3, 1900);
		Empregado e4 = new Empregado("Pedro", "Sousa", 4, 1200);
		Empregado e5 = new Empregado("Carla", "Lopes", 5, 1500);
		
		Registos registo = new Registos();
		registo.insere(e3);
		registo.insere(e4);
		registo.insere(e5);
		
		NewDatabase database = new NewDatabase(registo);
		database.addEmployee(e1);
		database.addEmployee(e2);
		
		//remover employee/empregado
		database.deleteEmployee(5);
		
		for(Employee e : database.getAllEmployees())
			System.out.println(e.toString());
	}

}
