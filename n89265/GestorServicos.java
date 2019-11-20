package n89265;

public interface GestorServicos extends Iterable<String> {

	public boolean registaServico(String id, Servico servico);
	public boolean existeServico(String id);
	public Servico eliminaServico(String id);
	public Servico getServico(String id);
		
}
