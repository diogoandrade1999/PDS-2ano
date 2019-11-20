package n89265;

public class ServicoVazio implements Servico {

	private String nome;
	private String descricao;
	private double custo;

	public ServicoVazio(String nome, String descricao, double custo) {
		this.nome = nome;
		this.descricao = descricao;
		this.custo = custo;
	}

	@Override
	public String nome() {
		return this.nome;
	}

	@Override
	public String descricao() {
		return this.descricao;
	}

	@Override
	public double custo() {
		return this.custo;
	}

	@Override
	public String toString() {
		return "ServicoVazio [nome=" + nome() + ", descricao=" + descricao() + ", custo=" + custo() + "]";
	}


}
