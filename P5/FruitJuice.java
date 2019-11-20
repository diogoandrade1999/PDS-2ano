package P5;

public class FruitJuice implements Commodity {

	private String fruit;
	
	public FruitJuice(String fruit) {
		this.fruit = fruit;
	}

	@Override
	public Temperature getTemperature() {
		return Temperature.COLD;
	}

	@Override
	public State getState() {
		return State.Liquid;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return "FruitJuice [fruit=" + fruit + ", Temperatura()=" + getTemperature() + ",  State()=" + getState() + "]";
	}

}
