package P5;

public class BeverageFactory {

	public static Commodity createBeverage(Temperature t) {
		if(t.equals(Temperature.COLD))
			return new FruitJuice("Orange");
		return new Milk();
	}

}
