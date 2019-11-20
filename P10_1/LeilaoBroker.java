package P10_1;

import java.util.*;

public class LeilaoBroker {
	
	private List<Cliente> clientes = new ArrayList<>();
	private List<Gestor> gestores = new ArrayList<>();
	private List<LeilaoSubject> leilaoSubjects = new ArrayList<>();

	public void addCliente(Cliente c) {
		clientes.add(c);
	}

	public void addGestor(Gestor g) {
		gestores.add(g);
	}

	public LeilaoSubject addProduto(Produto p, long i) {
		LeilaoSubject sub = new LeilaoSubject(p, i);
		leilaoSubjects.add(sub);
		return sub;
	}

	public String getProdutosLeilao() {
		
		return null;
	}

}
