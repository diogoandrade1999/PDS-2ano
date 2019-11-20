package P5_2;

public class CentralCantineLunchBuilder extends AbsLunchBuilder {

	@Override
	public void buildDrink() {
		lunch.setDrink("Água");
	}

	@Override
	public void buildMainCourse() {
		lunch.setMainCourse("Grelhada mista");
	}

	@Override
	public void buildSide() {
		lunch.setSide("Queijo fresco");
	}

	@Override
	public Lunch getMeal() {
		return this.lunch;
	}
	
}
