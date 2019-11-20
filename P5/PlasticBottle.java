package P5;

public class PlasticBottle extends Container {

	private Commodity commodity;

	public PlasticBottle(Commodity commodity) {
		this.commodity = commodity;
	}

	@Override
	public String toString() {
		return "PlasticBottle [commodity=" + commodity + "]";
	}

}
