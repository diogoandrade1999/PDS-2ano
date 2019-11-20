package P5;

public class TermicBottle extends Container {
	
	private Commodity commodity;

	public TermicBottle(Commodity commodity) {
		this.commodity = commodity;
	}

	@Override
	public String toString() {
		return "TermicBottle [commodity=" + commodity + "]";
	}
}
