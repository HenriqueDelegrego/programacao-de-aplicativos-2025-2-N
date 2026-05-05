
public class Ex3 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Joãozinho", 20, "827827358", "Desi", 8.5);
		Aluno a2 = new Aluno("Maria", 17, "8252", "Desi", 8.2);
		Aluno a3 = new Aluno("Ana", 18, "81825", "Arquitetura", 6);
		Aluno a4 = new Aluno("Carlos", 19, "825", "Desi", 8.9);

		SistemaDeAlunos s1 = new SistemaDeAlunos();

		s1.adicionarAluno(a1);
		s1.adicionarAluno(a2);
		s1.adicionarAluno(a3);
		s1.adicionarAluno(a4);

		System.out.println(s1.obterAlunos("Desi", 18, 8));

		System.out.println(s1.obterAluno("81825"));

	}

}
