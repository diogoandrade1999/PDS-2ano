package n89265;

public class TV implements Servico {
	
	private String nome;
	private String descricao;
	private double custo;
	private int canais;

	public TV(String nome, String descricao, double custo, int canais) {
		this.nome = nome;
		this.descricao = descricao;
		this.custo = custo;
		this.canais = canais;
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
		return "TV [nome=" + nome() + ", descricao=" + descricao() + ", custo=" + custo()
				+ "], canais=" + canais;
	}

}
