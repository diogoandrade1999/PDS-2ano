package n89265;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GestorServicosMinimo implements GestorServicos {
	
	private GestorServicos gest;

	public GestorServicosMinimo(GestorServicos gest) {
		this.gest = gest;
	}

	@Override
	public Iterator<String> iterator() {
		return gest.iterator();
	}

	@Override
	public boolean registaServico(String id, Servico servico) {
		if (existeServico(id))
			return true;
		return false;
	}

	@Override
	public boolean existeServico(String id) {
		return gest.existeServico(id);
	}

	@Override
	public Servico eliminaServico(String id) {
		return new ServicoVazio("nao existe", "nao existe", 0);
	}

	@Override
	public Servico getServico(String id) {
		return gest.getServico(id);
	}

}
