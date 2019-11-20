package P10_1;

public class Produto {

	private static int cod = 1;
	private int codigo;
	private String descricao;
	private Double preco;
	
	public Produto(String descricao, Double preco) {
		this.descricao = descricao;
		this.preco = preco;
		this.codigo = cod;
		cod++;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
