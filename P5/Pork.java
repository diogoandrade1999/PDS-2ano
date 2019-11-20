package P5;

public class Pork implements Commodity {
	
	@Override
	public Temperature getTemperature() {
		return Temperature.WARM;
	}

	@Override
	public State getState() {
		return State.Solid;
	}

	@Override
	public String toString() {
		return "Pork [Temperatura()=" + getTemperature() + ",  State()=" + getState() + "]";
	}

}
