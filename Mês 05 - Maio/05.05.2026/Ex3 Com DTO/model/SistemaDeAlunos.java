package model;

import java.util.ArrayList;
import java.util.List;

import dto.PesquisaAlunoDTO;

public class SistemaDeAlunos {

	private List<Aluno> listaAlunos;

	public SistemaDeAlunos() {
		listaAlunos = new ArrayList<Aluno>();
	}

	/**
	 * Realiza a busca de alunos com base em critérios definidos em um DTO.
	 *
	 * <p>
	 * Este método utiliza um objeto {@code PesquisaAlunoDTO} para encapsular os
	 * parâmetros de busca (curso, idade mínima e média mínima).
	 * </p>
	 *
	 * <p>
	 * Utilizar um DTO (Data Transfer Object) em vez de parâmetros soltos traz
	 * algumas vantagens importantes:
	 * </p>
	 *
	 * <ul>
	 * <li><b>Organização:</b> Agrupa todos os critérios de pesquisa em um único
	 * objeto, evitando métodos com muitos parâmetros.</li>
	 * <li><b>Legibilidade:</b> Torna a chamada do método mais clara, pois fica
	 * explícito que os dados fazem parte de uma mesma estrutura de busca.</li>
	 * <li><b>Manutenibilidade:</b> Permite adicionar novos critérios no futuro sem
	 * alterar a assinatura do método (evitando quebrar código existente).</li>
	 * <li><b>Reutilização:</b> O DTO pode ser utilizado em outras camadas da
	 * aplicação, como APIs, formulários ou serviços.</li>
	 * </ul>
	 *
	 * <p>
	 * O método retorna apenas os alunos que atendem simultaneamente a todos os
	 * critérios: mesmo curso, idade maior ou igual à informada e média final maior
	 * ou igual à informada.
	 * </p>
	 *
	 * @param pesquisa objeto contendo os critérios de busca dos alunos
	 * @return lista de alunos que satisfazem os critérios informados
	 */
	public List<Aluno> obterAlunos(PesquisaAlunoDTO pesquisa) {

		List<Aluno> listaPesquisaAlunos = new ArrayList<Aluno>();

		for (Aluno a : listaAlunos) {
			if (a.getCurso().equalsIgnoreCase(pesquisa.getCurso()) && a.getIdade() >= pesquisa.getIdade()
					&& a.getMediaFinal() >= pesquisa.getMediaFinal()) {
				listaPesquisaAlunos.add(a);
			}
		}

		return listaPesquisaAlunos;
	}

	/**
	 * Busca um aluno pela matrícula.
	 *
	 * @param matricula Matrícula do aluno a ser buscado
	 * @return O aluno correspondente à matrícula ou null caso não seja encontrado
	 */
	public Aluno obterAluno(String matricula) {
		for (Aluno a : listaAlunos) {
			if (a.getMatricula().equals(matricula)) {
				return a;
			}
		}
		return null;
	}

	/**
	 * Adiciona um novo aluno à lista.
	 *
	 * @param a Aluno a ser adicionado
	 */
	public void adicionarAluno(Aluno a) {
		listaAlunos.add(a);
	}

	/**
	 * Retorna a lista completa de alunos cadastrados.
	 *
	 * @return Lista de alunos
	 */
	public List<Aluno> obterListaAlunos() {
		return listaAlunos;
	}
}