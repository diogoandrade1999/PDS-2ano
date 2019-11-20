package P5_2;

public class SnackLunchBuilder extends AbsLunchBuilder {
	
	@Override
	public void buildDrink() {
		lunch.setDrink("Sumo");
	}

	@Override
	public void buildMainCourse() {
		lunch.setMainCourse("P�o com Panado");
	}

	@Override
	public void buildSide() {
		lunch.setSide("Rissol");
	}

	@Override
	public Lunch getMeal() {
		return this.lunch;
	}

}
