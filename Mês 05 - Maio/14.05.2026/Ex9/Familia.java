import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma família composta por várias pessoas.
 */
public class Familia {

	/**
	 * Lista de pessoas pertencentes à família.
	 */
	private List<Pessoa> listaPessoas;

	/**
	 * Cria uma família com a lista de pessoas inicialmente vazia.
	 */
	public Familia() {
		listaPessoas = new ArrayList<Pessoa>();
	}

	/**
	 * Adiciona uma pessoa à família.
	 * 
	 * @param p pessoa a ser adicionada
	 */
	public void adicionarPessoa(Pessoa p) {
		listaPessoas.add(p);
	}

	/**
	 * Obtém a pessoa mais velha da família.
	 * 
	 * A pessoa mais velha é aquela com a data de nascimento mais antiga.
	 * 
	 * @return a pessoa mais velha da família ou {@code null} caso a lista esteja
	 *         vazia
	 */
	public Pessoa obterPessoaMaisVelha() {

		Pessoa pMaisVelha = null;
		LocalDate dataMaisVelha = LocalDate.now();

		for (Pessoa p : listaPessoas) {
			if (p.getDataNascimento().isBefore(dataMaisVelha)) {
				dataMaisVelha = p.getDataNascimento();
				pMaisVelha = p;
			}
		}

		return pMaisVelha;

	}

}