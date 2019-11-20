package P7_1;

import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Employee employee = new ConcreteEmployee("Ana");
		Manager manager = new Manager(new ConcreteEmployee("Rui"));
		TeamMember teammember1 = new TeamMember(new ConcreteEmployee("joão"));
		TeamMember teammember2 = new TeamMember(employee);
		TeamMember teammember3 = new TeamMember(manager);
		TeamLeader teamleader1 = new TeamLeader(employee);
		TeamLeader teamleader2 = new TeamLeader(new TeamLeader(new Manager(new ConcreteEmployee("Bruna"))));
		
		Employee lista[] = {employee, manager, teammember1, teammember2, teammember3, teamleader1, teamleader2};
		
		
		for (Employee e: lista) {
			e.start(new Date(2019, 4, 1));
			e.terminate(new Date(2019, 4, 8));
			System.out.println(e.work());
		}
	}

}
