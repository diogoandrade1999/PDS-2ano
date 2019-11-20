package P5;

public class Tupperware extends Container {
	
	private Commodity commodity;

	public Tupperware(Commodity commodity) {
		this.commodity = commodity;
	}

	@Override
	public String toString() {
		return "Tupperware [commodity=" + commodity + "]";
	}
}
