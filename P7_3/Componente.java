package P7_3;

public abstract class Componente {

	private String descricao;
	
	public Componente(String descricao) {
		this.descricao = descricao;
	}

	public void draw(String ident) {
		System.out.println(this.descricao);
	}
}
