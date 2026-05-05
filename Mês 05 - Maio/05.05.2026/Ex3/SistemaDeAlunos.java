import java.util.ArrayList;
import java.util.List;

public class SistemaDeAlunos {

	private List<Aluno> listaAlunos;

	public SistemaDeAlunos() {
		listaAlunos = new ArrayList<Aluno>();
	}

	/**
	 * Retorna uma lista de alunos filtrados com base nos critérios informados.
	 *
	 * @param curso      Curso que o aluno deve estar matriculado (não diferencia
	 *                   maiúsculas/minúsculas)
	 * @param idade      Idade mínima do aluno
	 * @param mediaFinal Média final mínima do aluno
	 * @return Lista de alunos que atendem aos critérios
	 */
	public List<Aluno> obterAlunos(String curso, int idade, double mediaFinal) {

		List<Aluno> listaPesquisaAlunos = new ArrayList<Aluno>();

		for (Aluno a : listaAlunos) {
			if (a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMediaFinal() >= mediaFinal) {
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