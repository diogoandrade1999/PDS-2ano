package P10_1;

public class Main {

	public static void main(String[] args) {
		LeilaoBroker broker = new LeilaoBroker();
		
		Cliente c1 = new Cliente("João Sousa");
		Cliente c2 = new Cliente("Maria Pinto");
		Cliente c3 = new Cliente("Xana CAbral");

		Gestor g1 = new Gestor("Manuel Chaves");
		
		Produto p1 = new Produto("Caixa de fósforos", (double) 20000);
		Produto p2 = new Produto("Nissan Patrol", (double) 15000);
		
		broker.addCliente(c1);
		broker.addCliente(c2);
		broker.addCliente(c3);
		
		broker.addGestor(g1);
		
		LeilaoSubject sub1 = broker.addProduto(p1, 10);
		LeilaoSubject sub2 = broker.addProduto(p2, 10);
		
		System.out.println("Produtos em leilao #1: " + broker.getProdutosLeilao());
		
		sub1.setState(Estado.LEILAO);
		sub1.makeBid(c1, 21000);
		sub1.makeBid(c2, 22000);
		
		sub2.setState(Estado.LEILAO);
		sub2.makeBid(c2, 16000);
		
		System.out.println("Produtos em leilao #2: " + broker.getProdutosLeilao());
	}

}
