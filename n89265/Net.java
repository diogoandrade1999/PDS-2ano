package n89265;

public class Net implements Servico {

	private String nome;
	private String descricao;
	private double custo;
	private String tamanho;

	public Net(String nome, String descricao, double custo, String tamanho) {
		this.nome = nome;
		this.descricao = descricao;
		this.custo = custo;
		this.tamanho = tamanho;
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
		return "Net [nome=" + nome() + ", descricao=" + descricao() + ", custo=" + custo() + "]";
	}
}
