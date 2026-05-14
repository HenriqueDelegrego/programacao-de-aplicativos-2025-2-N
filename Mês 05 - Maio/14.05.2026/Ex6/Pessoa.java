/**
 * Classe que representa uma pessoa.
 * 
 * A classe Pessoa possui duas informações principais: - nome da pessoa -
 * endereço da pessoa
 * 
 * Observe que o endereço NÃO é representado apenas por uma String. Em vez
 * disso, foi criada uma classe específica chamada Endereco.
 * 
 * Isso é um exemplo de COMPOSIÇÃO entre classes: uma Pessoa "tem um" Endereco.
 * 
 * Dessa forma, a classe Pessoa reutiliza a classe Endereco como um atributo,
 * deixando o código mais organizado, reutilizável e orientado a objetos.
 */
public class Pessoa {

	/**
	 * Nome da pessoa.
	 */
	private String nome;

	/**
	 * Endereço da pessoa.
	 * 
	 * Aqui está o ponto mais importante: o atributo endereco NÃO é String.
	 * 
	 * Ele é do tipo Endereco, ou seja, uma Pessoa armazena um OBJETO Endereco.
	 * 
	 * Isso significa que uma Pessoa possui todas as informações do endereço: UF,
	 * cidade, CEP, logradouro etc.
	 */
	private Endereco endereco;

	/**
	 * Construtor da classe Pessoa.
	 * 
	 * Para criar uma Pessoa, é necessário informar: - nome - um objeto Endereco já
	 * criado
	 * 
	 * Exemplo:
	 * 
	 * Endereco e = new Endereco(...); Pessoa p = new Pessoa("Carlos", e);
	 */
	public Pessoa(String nome, Endereco endereco) {
		setNome(nome);
		setEndereco(endereco);
	}

	/**
	 * Retorna o nome da pessoa.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome da pessoa.
	 * 
	 * Validação: o nome não pode ser nulo nem vazio.
	 */
	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}

	/**
	 * Retorna o objeto Endereco associado à pessoa.
	 * 
	 * Perceba que o retorno é do tipo Endereco, não String.
	 * 
	 * Isso permite acessar os dados internos do endereço:
	 * 
	 * pessoa.getEndereco().getCidade(); pessoa.getEndereco().getCep();
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * Define o endereço da pessoa.
	 * 
	 * O parâmetro recebido é um OBJETO Endereco.
	 * 
	 * Isso mostra a relação entre as classes: uma Pessoa depende de um Endereco
	 * para armazenar suas informações de localização.
	 */
	public void setEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new IllegalArgumentException("Endereço inválido");
		}
		this.endereco = endereco;
	}

	/**
	 * Representação textual do objeto Pessoa.
	 * 
	 * Quando o endereco é concatenado na String, automaticamente o método
	 * toString() da classe Endereco é chamado.
	 */
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}

}