package P7_3;

public class Quadrado extends Componente {

	public Quadrado(String string) {
		super(string);
	}
	
	public void draw(String ident) {
		System.out.print("Quadrado ");
		super.draw(ident);
	}
}
