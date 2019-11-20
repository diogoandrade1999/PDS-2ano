package n89265;

public class Voz implements Servico {

	private String nome;
	private String descricao;
	private double custo;

	public Voz(String nome, String descricao, double custo) {
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
		return "Voz [nome=" + nome() + ", descricao=" + descricao() + ", custo=" + custo() + "]";
	}

}
