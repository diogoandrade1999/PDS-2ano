package P10_1;

public class Gestor extends LeilaoObserver {

	private String nome;

	public Gestor(String nome) {
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
			System.out.println("Gestor Info -> Vendido: " + sub.getHighestBid() + " - " + prod);
		else if(sub.getState() == Estado.LEILAO)
			if(sub.getHighestBid() == 0)
				System.out.println("Gestor Info -> Vendido: " + sub.getHighestBid() + " - " + prod);
			else
				System.out.println("Gestor Info -> Vendido: " + sub.getHighestBid() + " - " + prod);
	}

}
