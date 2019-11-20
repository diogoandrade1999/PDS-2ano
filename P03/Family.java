package P03;

import java.util.*;

public class Family {

	private int[] apartamentos;
	private List<Pessoa> pessoas;
	
	public Family(Pessoa p) {
		this.apartamentos = p.getApartamentos();
		this.pessoas = new LinkedList<>();
		pessoas.add(p);
	}
	
	public boolean sameFamily(Pessoa p) {
		return Arrays.equals(this.apartamentos, p.getApartamentos());
	}
	
	public void addPessoa(Pessoa p) {
		pessoas.add(p);
	}

	public int[] getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(int[] apartamentos) {
		this.apartamentos = apartamentos;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public int getSize() {
		return this.apartamentos.length;
	}

	@Override
	public String toString() {
		String s = "";
		for(Pessoa p : pessoas)
			s += " " + p;
		return s;
	}

}
