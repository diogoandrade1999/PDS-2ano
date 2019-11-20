package P5_2;

public class LunchDirector {
	
	protected LunchBuilder lunch;

	public LunchDirector(LunchBuilder lunch) {
		this.lunch = lunch;
	}

	public void constructMeal() {
		lunch.buildDrink();
		lunch.buildMainCourse();
		lunch.buildSide();
	}

	public Lunch getMeal() {
		return this.lunch.getMeal();
	}

}
