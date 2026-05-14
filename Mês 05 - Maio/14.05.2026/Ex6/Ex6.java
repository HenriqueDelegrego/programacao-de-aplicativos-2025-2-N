/**
 * Classe principal do programa.
 * 
 * O método main é o ponto de entrada da aplicação Java. A execução começa por
 * ele.
 */
public class Ex6 {

	public static void main(String[] args) {

		/**
		 * Criação de um objeto Pessoa.
		 * 
		 * Aqui acontece algo muito importante:
		 * 
		 * 1) Primeiro é criado um objeto Endereco 2) Esse objeto é enviado diretamente
		 * para o construtor da Pessoa
		 * 
		 * Ou seja: a Pessoa recebe um Endereco completo como atributo.
		 * 
		 * Isso demonstra a relação de composição entre as classes:
		 * 
		 * Pessoa TEM UM Endereco.
		 * 
		 * Observe que o objeto Endereco está sendo criado "dentro" da criação da
		 * Pessoa:
		 * 
		 * new Pessoa(..., new Endereco(...))
		 * 
		 * Isso é totalmente válido em Java.
		 */

		Pessoa p1 = new Pessoa("Carlos", new Endereco("SC", "Blumenau", "8851", "Rua São Paulo", "180"));

		/**
		 * Exibe o objeto p1 no console.
		 * 
		 * Quando usamos System.out.println() com um objeto, o Java chama
		 * automaticamente o método toString().
		 * 
		 * Primeiro é chamado: Pessoa.toString()
		 * 
		 * Como a Pessoa possui um atributo endereco, o Java também chama
		 * automaticamente: Endereco.toString()
		 * 
		 * Resultado: todas as informações da pessoa e do endereço são exibidas.
		 */
		System.out.println(p1);

	}

}