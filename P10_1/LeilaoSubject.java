package P10_1;

import java.util.*;

public class LeilaoSubject {
	
	private List<LeilaoObserver> observers = new ArrayList<>();
	private Estado state;
	private Produto produto;
	private Timer timer;
	private Long maxDuracao;
	private Licitacao bids = new Licitacao();
	
	public LeilaoSubject(Produto produto, long maxDuracao) {
		this.produto = produto;
		this.state = Estado.STOCK;
		this.maxDuracao = maxDuracao;
		timer = new Timer();
	}

	public Estado getState() {
		return state;
	}

	public void setState(Estado s) {
		if(getState() == state.VENDIDO)
			
		this.state = state;
		notifyObservers();
	}

	private void notifyObservers() {
		for (LeilaoObserver obs : observers) {
			obs.update();
		}
	}

	public boolean makeBid(Cliente c, double i) {
		if(bids.getMaxBid() >= i || produto.getPreco() > i)
			return false;
		
		bids.addBid(c, i);
		c.addSubject(this);
		notifyObservers();
		return true;
	}

	public void attach(LeilaoObserver l) {
		observers.add(l);
	}
	
	public double getHighestBid() {
		return bids.getMaxBid();
	}

	public Object getProduto() {
		return produto;
	}

}
