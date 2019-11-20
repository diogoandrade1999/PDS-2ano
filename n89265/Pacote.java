package n89265;

import java.util.*;

public class Pacote implements Servico {

	private List<Servico> s = new ArrayList<>();
	private String nome;
	private String descricao;
	private int fidelizacao;
	private double custo;

	public Pacote(String nome, String descricao, int fidelizacao) {
		this.nome = nome;
		this.descricao = descricao;
		this.fidelizacao = fidelizacao;
		this.custo = 0;
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
		String se = "";
		for(Servico i : s)
			se += "\n\t" + i.toString();
		return "Pacote [nome=" + nome() + ", descricao=" + descricao() + ", custo=" + custo()
				+ "] com fidelizacao de " + fidelizacao + " meses" + se;
	}

	public void add(Servico servico) {
		s.add(servico);
		custo += servico.custo()*0.84;
	}

}
