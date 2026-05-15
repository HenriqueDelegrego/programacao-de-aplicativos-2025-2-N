import java.time.LocalDate;

public class Ex9 {

	public static void main(String[] args) {

		/*
		 * A classe LocalDate representa uma data (ano, mês e dia).
		 * 
		 * O método LocalDate.of(ano, mes, dia) cria um objeto LocalDate.
		 * 
		 * Exemplo: LocalDate.of(2001, 5, 8) representa a data 08/05/2001.
		 */

		// Criando objetos Pessoa com nome e data de nascimento
		Pessoa p1 = new Pessoa("João", LocalDate.of(2001, 5, 8));
		Pessoa p2 = new Pessoa("Ana", LocalDate.of(2002, 5, 8));
		Pessoa p3 = new Pessoa("Maria", LocalDate.of(1998, 5, 8));
		Pessoa p4 = new Pessoa("Carlos", LocalDate.of(2004, 2, 8));

		// Criando um objeto da classe Familia
		Familia f1 = new Familia();

		// Adicionando pessoas à família
		f1.adicionarPessoa(p1);
		f1.adicionarPessoa(p2);
		f1.adicionarPessoa(p3);
		f1.adicionarPessoa(p4);

		System.out.println(f1.obterPessoaMaisVelha());

	}

}