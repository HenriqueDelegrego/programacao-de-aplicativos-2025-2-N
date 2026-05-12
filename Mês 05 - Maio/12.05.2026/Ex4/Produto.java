
public class Produto {

	private String marca;
	private String modelo;
	private double preco;
	private int qtdEstoque;

	public Produto(String marca, String modelo, double preco, int qtdEstoque) {
		setMarca(marca);
		setModelo(modelo);
		setPreco(preco);
		setQtdEstoque(qtdEstoque);
	}

	public void adicionarQtdEstoque(int quantidade) {
		qtdEstoque += quantidade;
	}

	public void venderProduto(int quantidade) {
		if (quantidade > qtdEstoque) {
			throw new IllegalArgumentException("Produtos insuficientes");
		}

		qtdEstoque -= quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca inválida");
		}
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido");
		}
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0) {
			throw new IllegalArgumentException("Quantidade em estoque inválido");
		}
		this.qtdEstoque = qtdEstoque;
	}

	@Override
	public String toString() {
		return "Produto [marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque
				+ "]";
	}

}
