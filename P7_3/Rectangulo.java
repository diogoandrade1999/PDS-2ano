package P7_3;

public class Rectangulo extends Componente {

	public Rectangulo(String string) {
		super(string);
	}

	public void draw(String ident) {
		System.out.print("Retangulo ");
		super.draw(ident);
	}
}
