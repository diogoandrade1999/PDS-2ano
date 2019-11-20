package P5;

public class Tuna implements Commodity {

	@Override
	public Temperature getTemperature() {
		return Temperature.COLD;
	}

	@Override
	public State getState() {
		return State.Solid;
	}

	@Override
	public String toString() {
		return "Tuna [Temperatura()=" + getTemperature() + ",  State()=" + getState() + "]";
	}

}
