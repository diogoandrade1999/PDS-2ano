package n89265;

import java.util.*;

public class Registo {
	
	List<Servico> servicosrem = new ArrayList<>();
	List<Servico> servicosadd = new ArrayList<>();

	public void verregistos() {
		if(!servicosadd.isEmpty()) {
			System.out.println("Servicos registados:");
			
			for(Servico s : servicosadd) {
				System.out.println("\t" + s);
			}
		}
		if(!servicosrem.isEmpty()) {
			System.out.println("Servicos removidos:");
			
			for(Servico s : servicosrem) {
				System.out.println("\t" + s);
			}
		}
	}

	public void addregistorem(Servico s) {
		servicosrem.add(s);
	}

	public void addregistoadd(Servico s) {
		servicosadd.add(s);
	}

}
