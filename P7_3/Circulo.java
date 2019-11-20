package P7_3;

public class Circulo extends Componente {
	
	public Circulo(String string) {
		super(string);
	}

	public void draw(String ident) {
		System.out.print("Circulo ");
		super.draw(ident);
	}
}
