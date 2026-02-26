import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do seu colega");

		String nome = input.next();

		if (nome.equalsIgnoreCase("João")) {
			joaoPedro();
		} else if (nome.equalsIgnoreCase("Kevin")) {
			kevin();
		}

	}

	public static void joaoPedro() {
		System.out.println("O nome dele é João");
		System.out.println("Ele tem 20 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}

	public static void kevin() {
		System.out.println("O nome dele é Kevin");
		System.out.println("Ele tem 19 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}

}
