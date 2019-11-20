package P7_3;

import java.util.*;

public class Bloco extends Componente {

	private List<Componente> componentes;
	
	public Bloco(String string) {
		super(string);
		componentes = new ArrayList<>();
	}

	public void add(Componente c) {
		componentes.add(c);
	}

	public void draw(String ident) {
		System.out.print("Window ");
		super.draw("");
		ident += "\t";
		for(Componente c : componentes) {
			System.out.print(ident);
			c.draw(ident);
		}
	}
}
