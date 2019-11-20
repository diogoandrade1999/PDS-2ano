package P5;

public class ContainerFactory {

	public static Container createContainerFor(Commodity c) {
		if(c.getState().equals(State.Liquid)){
			if(c.getTemperature().equals(Temperature.COLD))
				return new PlasticBottle(c);
			return new TermicBottle(c);
		}
		if(c.getTemperature().equals(Temperature.COLD))
			return new PlasticBag(c);
		return new Tupperware(c);
	}

}
