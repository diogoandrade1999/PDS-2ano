package P12_3;

public class Owner {

	private String name;
	
	public Owner(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Owner: {\nName: " + name + "\n}";
	}

}
