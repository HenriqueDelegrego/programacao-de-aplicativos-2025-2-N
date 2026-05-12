
public class Ex4 {

	public static void main(String[] args) {

		Produto p1 = new Produto("Vonder", "Martelo", 50, 10);
		Produto p2 = new Produto("Bosch", "Regua", 20, 10);
		Produto p3 = new Produto("3M", "Trena", 30, 10);
		Produto p4 = new Produto("Makita", "Capacete", 80, 10);
		Produto p5 = new Produto("Vonder", "Nível", 20, 10);

		MateriaisConstrucoes m1 = new MateriaisConstrucoes();

		m1.adicionarProduto(p1);
		m1.adicionarProduto(p2);
		m1.adicionarProduto(p3);
		m1.adicionarProduto(p4);
		m1.adicionarProduto(p5);

		System.out.println(m1.obterProdutoMaisCaroMarca("Vonder"));

		System.out.println(m1.produtosMarcaEPreco("Vonder", 10, 40));

	}

}
