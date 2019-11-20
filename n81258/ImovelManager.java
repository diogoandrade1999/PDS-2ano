package n81258;

public interface ImovelManager extends Iterable<String> {

	public boolean existeImovel(String code);
	public boolean addImovel(String code, Imovel imo);
	public Imovel retiraImovel(String code);
	
	
}
