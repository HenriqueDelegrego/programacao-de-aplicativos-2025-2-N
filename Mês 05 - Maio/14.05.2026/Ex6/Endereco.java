/**
 * Classe que representa um endereço.
 * 
 * Essa classe foi criada separadamente para encapsular todas as informações
 * relacionadas a endereço.
 * 
 * Em vez de colocar vários atributos de endereço diretamente dentro da classe
 * Pessoa, criamos uma classe própria.
 * 
 * Isso traz várias vantagens: - melhor organização - reutilização - maior
 * legibilidade - melhor modelagem orientada a objetos
 * 
 * A classe Pessoa então utiliza um objeto Endereco como atributo.
 */
public class Endereco {

	/**
	 * Unidade Federativa (estado). Exemplo: SP, RJ, MG.
	 */
	private String uf;

	/**
	 * Cidade do endereço.
	 */
	private String cidade;

	/**
	 * CEP do endereço.
	 */
	private String cep;

	/**
	 * Nome da rua, avenida etc.
	 */
	private String logradouro;

	/**
	 * Número da residência.
	 */
	private String numeroResidencia;

	/**
	 * Construtor da classe Endereco.
	 * 
	 * Ao criar um endereço, todos os dados obrigatórios devem ser informados.
	 */
	public Endereco(String uf, String cidade, String cep, String logradouro, String numeroResidencia) {
		setUf(uf);
		setCidade(cidade);
		setCep(cep);
		setLogradouro(logradouro);
		setNumeroResidencia(numeroResidencia);
	}

	/**
	 * Retorna a UF.
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * Define a UF.
	 */
	public void setUf(String uf) {
		if (uf == null || uf.isBlank()) {
			throw new IllegalArgumentException("Uf inválido");
		}
		this.uf = uf;
	}

	/**
	 * Retorna a cidade.
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * Define a cidade.
	 */
	public void setCidade(String cidade) {
		if (cidade == null || cidade.isBlank()) {
			throw new IllegalArgumentException("Cidade inválida");
		}
		this.cidade = cidade;
	}

	/**
	 * Retorna o CEP.
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Define o CEP.
	 */
	public void setCep(String cep) {
		if (cep == null || cep.isBlank()) {
			throw new IllegalArgumentException("Cep inválido");
		}
		this.cep = cep;
	}

	/**
	 * Retorna o logradouro.
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * Define o logradouro.
	 */
	public void setLogradouro(String logradouro) {
		if (logradouro == null || logradouro.isBlank()) {
			throw new IllegalArgumentException("Logradouro inválido");
		}
		this.logradouro = logradouro;
	}

	/**
	 * Retorna o número da residência.
	 */
	public String getNumeroResidencia() {
		return numeroResidencia;
	}

	/**
	 * Define o número da residência.
	 */
	public void setNumeroResidencia(String numeroResidencia) {
		if (numeroResidencia == null || numeroResidencia.isBlank()) {
			throw new IllegalArgumentException("Numero de residência inválido");
		}
		this.numeroResidencia = numeroResidencia;
	}

	/**
	 * Representação textual do endereço.
	 */
	@Override
	public String toString() {
		return "Endereco [uf=" + uf + ", cidade=" + cidade + ", cep=" + cep + ", logradouro=" + logradouro
				+ ", numeroResidencia=" + numeroResidencia + "]";
	}

}