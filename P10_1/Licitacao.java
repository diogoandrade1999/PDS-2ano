package P10_1;

import java.util.*;

public class Licitacao {

	private double MaxBid;
	private HashMap<Cliente, Double> bids = new HashMap<>();

	
	public double getMaxBid() {
		return this.MaxBid;
	}

	public void addBid(Cliente c, double i) {
		bids.put(c, i);
	}

}
