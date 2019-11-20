package P10_1;

public class Cliente extends LeilaoObserver {

	private String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Produto prod) {
		LeilaoSubject sub = getLeilaoSubject(prod);
		
		if(sub == null) return;
		
		if(sub.getState() == Estado.VENDIDO)
			System.out.println();
	}


}
