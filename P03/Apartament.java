package P03;

import java.util.*;

public class Apartament {

	private static int num = 1;
	private List<Family> familias;
	
	public Apartament(Family f) {
		this.familias = new ArrayList<>();
		familias.add(f);
		
		for(int i : f.getApartamentos())
			if(num < i)
				num = i;
	}
	
	public void addFamily(Family f) {
		familias.add(f);
		
		for(int i : f.getApartamentos())
			if(num < i)
				num = i;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Apartament.num = num;
	}

	public List<Family> getFamilias() {
		return familias;
	}

	public void setFamilias(List<Family> familias) {
		this.familias = familias;
	}

	@Override
	public String toString() {
		String s = "";
		//this.familias.sort(Comparator.comparing(Family::getSize));
		for(Family f : familias)
			s += " : " + f;
		return s;
	}

}
