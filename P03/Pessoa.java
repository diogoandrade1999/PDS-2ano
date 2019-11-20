package P03;

public class Pessoa {

	private String name;
	private int[] apartamentos;

	public Pessoa(String name, String apart) {
		this.name = name;
		
		String[] numb = apart.split("-");
		int max = Integer.parseInt(numb[1]);
		int min = Integer.parseInt(numb[0]);
		int size = max - min + 1;
		this.apartamentos = new int[size];
		for(int i = min, j = 0; i <= max; i++, j++)
			this.apartamentos[j] = i;
	}
	
	public String getName() {
		return name;
	}

	public int[] getApartamentos() {
		return apartamentos;
	}

	@Override
	public String toString() {
		return name;
	}

}
