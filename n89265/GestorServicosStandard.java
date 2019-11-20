package n89265;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GestorServicosStandard implements GestorServicos {
	
	private Map<String, Servico> servicos = new TreeMap<>();
	
	@Override
	public Iterator<String> iterator() {
		List<String> l = new ArrayList<>();
		Iterator<String> it = servicos.keySet().iterator();
		for (Map.Entry<String, Servico> s : servicos.entrySet()) {
	       l.add("Ref: " + s.getKey() + " - " + s.getValue());
	    }
		return l.iterator();
	}
	@Override
	public boolean registaServico(String id, Servico servico) {
		if (existeServico(id)) {
			servicos.replace(id, servico);
		}else {
			servicos.put(id, servico);
		}
		return true;
	}

	@Override
	public boolean existeServico(String id) {
		if (servicos.containsKey(id))
			return true;
		return false;
	}

	@Override
	public Servico eliminaServico(String id) {
		Servico s = null;
		if (existeServico(id)) {
			s = getServico(id);
			servicos.remove(id);
		}
		return s;
	}

	@Override
	public Servico getServico(String id) {
		Servico s = null;
		if (existeServico(id)) {
			s = servicos.get(id);
		}
		return s;
	}
	
}
