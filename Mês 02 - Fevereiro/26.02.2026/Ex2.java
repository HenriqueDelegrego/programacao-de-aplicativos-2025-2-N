import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do seu colega");

		String nome = input.next();

		// Utilizando o método equalsIgnoreCase para comparar os nomes, ignorando
		// maiúsculas e minúsculas
		if (nome.equalsIgnoreCase("João")) {
			joaoPedro();
		} else if (nome.equalsIgnoreCase("Kevin")) {
			kevin();
		}

	}

	/**
	 * Método para exibir as informações do João Pedro
	 */
	public static void joaoPedro() {
		System.out.println("O nome dele é João");
		System.out.println("Ele tem 20 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}

	/**
	 * Método para exibir as informações do Kevin
	 */
	public static void kevin() {
		System.out.println("O nome dele é Kevin");
		System.out.println("Ele tem 19 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}

}
