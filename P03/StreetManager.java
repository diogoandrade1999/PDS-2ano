package P03;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class StreetManager {

	public static Map<Integer, Apartament> apartamentos;
	public static List<String> names;
	
	public static void main(String[] args) throws InterruptedException {
		apartamentos = new TreeMap<>();
		names = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.print("Insira comandos: ");
		do {
			String comando = input.nextLine();
			
			String filename = null;
			String name = null;
			String x = null;
			if(comando.toUpperCase().contains("LOAD")) {
				filename = comando.split("[\\s+]")[1];
				comando = "LOAD";
			}else if(comando.toUpperCase().contains("ADD")) {
				String[] data = comando.split("[\\s+]");
				name = data[1];
				x = data[2] + "-" + data[3];
				comando = "ADD";
			}else if(comando.toUpperCase().contains("REMOVE")) {
				name = comando.split("[\\s+]")[1];
				comando = "REMOVE";
			}
			
			switch(comando.toUpperCase()){
				case "LOAD":
					load(filename);
					break;
				case "MAP":
					for(int i = 1; i < Apartament.getNum(); i++) {
						if(apartamentos.containsKey(i))
							System.out.printf("%-2d %s\n",i, apartamentos.get(i));
						else
							System.out.println(i);
					}
					break;
				case "ADD":
					add(name,x);
					break;
				case "REMOVE":
					remove(name);
					break;
				case "CLEAR":
					apartamentos.clear();
					names.clear();
					break;
				case "QUIT":
					input.close();
					System.exit(0);
					break;
				default:
					System.err.println("Não implementado");
			}
			
			TimeUnit.SECONDS.sleep(1);
			
			System.out.print("\nInsira comandos: ");
		}while(input.hasNext());
	}

	public static void load(String filename) {
		Scanner file;
		try {
			List<Family> familias = new ArrayList<>();
			
			file = new Scanner(new FileReader(filename));
			
			while(file.hasNextLine()) {
				String[] data = file.nextLine().split("[\\s+]");
				if(!data[0].contains(">")) {
					Pessoa p = new Pessoa(data[1], data[0]);
					if(names.contains(p.getName())) {
						System.err.println(p.toString() + " já inserido!");
					}else {
						names.add(p.getName());
						if(familias.size() > 0) {
							boolean add = true;
							for(Family f : familias) {
								if(f.sameFamily(p)) {
									f.addPessoa(p);
									add = false;
									break;
								}
							}
							if(add) familias.add(new Family(p));
						}else {
							familias.add(new Family(p));
						}
					}
				}
			}
			
			file.close();
			
			for(Family f : familias) {
				for(int a : f.getApartamentos()) {
					if(apartamentos.containsKey(a)) {
						apartamentos.get(a).addFamily(f);;
					}else {
						apartamentos.put(a, new Apartament(f));
					}
				}
			}
			
			System.out.println("DONE");
		} catch (FileNotFoundException e) {
			System.err.println("Não foi possivel ler o ficheiro!");
		}
	}

	public static void add(String name, String x) {
		Pessoa p = new Pessoa(name, x);
		if(names.contains(p.getName())) {
			System.err.println(p.toString() + " já inserido!");
		}else {
			names.add(p.getName());
			boolean add = false;
			for(int key : apartamentos.keySet()) {
				List<Family> f = apartamentos.get(key).getFamilias();
				for(Family fam : f) {
					int[] a = fam.getApartamentos();
					if(p.getApartamentos() == a) {
						fam.addPessoa(p);
						add = true;
						break;
					}
				}
				if(add) break;
			}
			if(!add) {
				Family f = new Family(p);
				for(int a : f.getApartamentos()) {
					if(apartamentos.containsKey(a)) {
						apartamentos.get(a).addFamily(f);;
					}else {
						apartamentos.put(a, new Apartament(f));
					}
				}
			}
			System.out.println("ADD SUCCESS");
		}
	}
	
	private static void remove(String name) {
		if(!names.contains(name)) {
			System.err.println(name + " não inserido!");
		}else {
			names.remove(name);
			boolean add = false;
			for(int key : apartamentos.keySet()) {
				Apartament a = apartamentos.get(key);
				List<Family> f = a.getFamilias();
				for(Family fam : f) {
					List<Pessoa> p = fam.getPessoas();
					for(Pessoa n : p)
						if(n.getName().equals(name)) {
							p.remove(n);
							if(p.size() > 0) {
								Family newFamily = fam;
								newFamily.setPessoas(p);
								f.remove(fam);
								f.add(newFamily);
								System.out.println(fam);
								System.out.println(newFamily);
								System.out.println(f);
								a.setFamilias(f);
								apartamentos.replace(key, a);
							} else {
								apartamentos.remove(key);
							}
							add = true;
							break;
						}
					if(add) break;
				}
				if(add) break;
			}
			System.out.println("REMOVE SUCCESS");
		}
	}
}
