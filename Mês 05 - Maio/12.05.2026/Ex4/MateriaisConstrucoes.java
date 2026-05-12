import java.util.ArrayList;
import java.util.List;

public class MateriaisConstrucoes {

	private List<Produto> listaProdutos;

	public MateriaisConstrucoes() {
		listaProdutos = new ArrayList<>();
	}

	public void adicionarProduto(Produto p) {
		listaProdutos.add(p);
	}

	public Produto obterProdutoMaisCaroMarca(String marca) {

		Produto produtoMaisCaro = null;
		double maiorPreco = 0;

		for (Produto p : listaProdutos) {
			if (p.getMarca().equals(marca) && p.getPreco() > maiorPreco) {
				maiorPreco = p.getPreco();
				produtoMaisCaro = p;
			}
		}

		return produtoMaisCaro;

	}

	public List<Produto> produtosMarcaEPreco(String marca, double precoMin, double precoMax) {

		List<Produto> listaRetorno = new ArrayList<Produto>();

		for (Produto p : listaProdutos) {
			if (p.getMarca().equals(marca) && p.getPreco() > precoMin && p.getPreco() < precoMax) {
				listaRetorno.add(p);
			}
		}

		return listaRetorno;

	}

}
