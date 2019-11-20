package P5_2;

public class CrastoLunchBuilder extends AbsLunchBuilder {
	
	@Override
	public void buildDrink() {
		lunch.setDrink("Vinho Tinto");
	}

	@Override
	public void buildMainCourse() {
		lunch.setMainCourse("Bacalhau à lagareiro");
	}

	@Override
	public void buildSide() {
		lunch.setSide("Broa");
	}

	@Override
	public Lunch getMeal() {
		return this.lunch;
	}

}
