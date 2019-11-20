package n81258;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

// Não deve alterar esta classe
// Comente linhas com erros para poder testar o código à medida que for desenvolvendo

public class PD51718S1 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream fl = new PrintStream(new File("habitacoes11.txt")); 	
		test(System.out);  // executa e escreve na consola
		test(fl);		   // executa e escreve no ficheiro
		fl.close(); 
	}

	private static void test(PrintStream out) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM HH:mm");
		
		ImovelManager imo = new ImoReal();
		
		// alínea a)
		out.println("\nAlínea a) ----------------------------------\n");
		Moradia m1 = new Moradia("T4", "Costa Nova", 445);
		imo.addImovel("A501", m1);
		imo.addImovel("A502", new Moradia("T3", "Costa Nova", 540).addChar("Vista Ria, Jardim"));
		imo.addImovel("X503", new Moradia("T4", "Aveiro", 670).addChar("Perto da UA, Em bom estado"));
		imo.addImovel("C504", new Moradia("T4", "Aveiro", 295).addChar("Longe da UA"));
		imo.addImovel("W505", new Apartamento("T2", "Vera Cruz", 210));
		imo.addImovel("N506", new Apartamento("T3", "Vagos", 185));
		m1.addChar("Vista Ria, Piscina, Jardim");
		m1.addChar("Nova, com garagem para 2 carros");

		Iterator<String> it = imo.iterator();
		while (it.hasNext()) {
			out.println(it.next());
		}
		
		// alínea b)
		out.println("\nAlínea b) ----------------------------------\n");
		SetImo c1 = new SetImo("Aveiro-Praias", "O mar a seus pés");
		c1.add(new Moradia("T3", "Costa Nova", 540).addChar("Vista Ria, Jardim"));
		c1.add(new Moradia("T4", "Aveiro", 670).addChar("Perto da UA, Em bom estado"));
		c1.add(new Moradia("T4", "Aveiro", 295).addChar("Longe da UA"));
		imo.addImovel("C001", c1);
		SetImo c2 = new SetImo("Esgueira-Bairro", "Vista Céu");
		c2.add(new Moradia("T5", "Esgueira", 275).addChar("Impecável"));
		imo.addImovel("C002", c2);
		out.println("Produto retirado da imobiliária: \n\t" + imo.retiraImovel("N506"));
		
		for (String s : imo) { 
			out.println(s);
		}
		
		// alínea c)
		out.println("\nAlínea c) ----------------------------------\n");
		ImoReal2 imoNorte = new ImoReal2("ImNorte"); 
		ImoReal2 imoSul = new ImoReal2("ImSul"); 
		Cliente[] clientes = { 
				new Cliente("Ana Compinta"),
				new Cliente("Paulo Cheiodeguito"),
				new Cliente("Maria Silva")
		};
		imoNorte.add(clientes[0]);
		imoNorte.add(clientes[2]);
		imoSul.add(clientes[0]);
		imoNorte.addImovel("AC01", new Moradia("T3", "Costa Nova", 540).addChar("Vista Ria, Jardim"));
		imoNorte.addImovel("AC02", new Apartamento("T3", "Vagos", 185));
		imoSul.addImovel("SC50", new Apartamento("T1", "Mira", 175));
		for (Cliente c: clientes) {
			out.println("[" + sdf.format(cal.getTime()) + "] Noticias recebidas por "+c.getName() );
			for (String info: c.lastNews())	out.println("\t"+info);
		}; 
		imoNorte.remove(clientes[0]);
		imoSul.add(clientes[1]);
		imoNorte.addImovel("AC03", new Moradia("T4", "Aradas", 140).addChar("A precisar de obras"));
		imoSul.addImovel("AC04", new Apartamento("T2", "Bomsucesso", 115));
		for (Cliente c: clientes) {
			out.println(".. [" + sdf.format(cal.getTime()) + "] Noticias recebidas por "+c.getName() );
			for (String info: c.lastNews())	out.println("\t"+info);
		}		
		
                
                
                //alínea d
                ImoRealMonopolista imoMono = ImoRealMonopolista.getSingleton();
		
                
                out.println("\nAlínea d) ----------------------------------\n");
		Moradia m2 = new Moradia("T4", "Costa Nova", 445);
		imoMono.addImovel("A501", m1);
		imoMono.addImovel("A502", new Moradia("T3", "Costa Nova", 540).addChar("Vista Ria, Jardim"));
		imoMono.addImovel("X503", new Moradia("T4", "Aveiro", 670).addChar("Perto da UA, Em bom estado"));
		imoMono.addImovel("C504", new Moradia("T4", "Aveiro", 295).addChar("Longe da UA"));
		imoMono.addImovel("W505", new Apartamento("T2", "Vera Cruz", 210));
		imoMono.addImovel("N506", new Apartamento("T3", "Vagos", 185));
		m1.addChar("Vista Ria, Piscina, Jardim");
		m1.addChar("Nova, com garagem para 2 carros");

                System.out.println("ITERADOR DE imoMono");
		Iterator<String> it2 = imoMono.iterator();
		while (it2.hasNext()) {
			out.println(it2.next());
		}
                
                
		ImoRealMonopolista imoMono2 = ImoRealMonopolista.getSingleton();
                System.out.println("ITERADOR DE imoMono2");
		
                Iterator<String> it3 = imoMono2.iterator();
		while (it3.hasNext()) {
			out.println(it3.next());
		}

                System.out.println("imoMono e imoMono2 são iguais? -> " + 
                        (imoMono == imoMono2 ? "Sim!" : "Não!"));
	}
	
}
