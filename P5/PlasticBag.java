package P5;

public class PlasticBag extends Container {

	private Commodity commodity;

	public PlasticBag(Commodity commodity) {
		this.commodity = commodity;
	}

	@Override
	public String toString() {
		return "PlasticBag [commodity=" + commodity + "]";
	}
}
