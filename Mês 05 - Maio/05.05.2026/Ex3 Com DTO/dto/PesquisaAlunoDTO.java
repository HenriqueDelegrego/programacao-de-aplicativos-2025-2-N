package dto;

/**
 * DTO (Data Transfer Object) <br>
 * Um DTO é um objeto simples usado para TRANSPORTAR dados entre partes do
 * sistema. <br>
 * Neste caso, ele serve para agrupar os critérios de pesquisa de alunos. Em vez
 * de um método com vários parâmetros soltos, como:
 * 
 * obterAlunos(String curso, int idade, double mediaFinal)
 * 
 * usamos um único objeto:
 * 
 * obterAlunos(PesquisaAlunoDTO pesquisa) <br>
 * Vantagens:<br>
 * - Organização: todos os dados relacionados ficam em um único objeto<br>
 * - Facilidade de manutenção: se adicionar um novo critério, não precisa mudar
 * a assinatura do método<br>
 * - Reutilização: o DTO pode ser usado em outros lugares (ex: APIs,
 * formulários, etc.)
 */
public class PesquisaAlunoDTO {

	private String curso;
	private int idade;
	private double mediaFinal;

	public PesquisaAlunoDTO(String curso, int idade, double mediaFinal) {
		setCurso(curso);
		setIdade(idade);
		setMediaFinal(mediaFinal);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		if (curso == null || curso.isBlank()) {
			throw new IllegalArgumentException("Curso inválido");
		}
		this.curso = curso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade inválida");
		}
		this.idade = idade;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		if (mediaFinal < 0 || mediaFinal > 10) {
			throw new IllegalArgumentException("Média final inválida");
		}
		this.mediaFinal = mediaFinal;
	}

}
