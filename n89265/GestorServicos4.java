package n89265;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GestorServicos4 implements GestorServicos {

	private Map<String, Servico> servicos = new TreeMap<>();
	private Registo reg;
	
	public GestorServicos4(Registo reg) {
		this.reg = reg;
	}
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
		reg.addregistoadd(servico);
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
			reg.addregistorem(s);
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
