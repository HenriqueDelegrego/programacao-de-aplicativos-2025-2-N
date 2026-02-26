import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número da estação");
		int estacao = input.nextInt();

		if (estacao == 1) {
			// Chama o método para imprimir as informações do verão
			imprimirVerao();
		} else if (estacao == 2) {
			imprimirOutono();
		} else if (estacao == 3) {
			imprimirInverno();
		} else if (estacao == 4) {
			imprimirPrimavera();
		} else {
			System.out.println("Escolha errada");
		}

	}

	/**
	 * Método para imprimir as informações do verão
	 */
	public static void imprimirVerao() {
		System.out.println("É verão");
		System.out.println("E o tempo está quente");

	}

	public static void imprimirOutono() {
		System.out.println("É outono");
		System.out.println("E as folhas estão caindo");
	}

	public static void imprimirInverno() {
		System.out.println("É inverno");
		System.out.println("E o tempo está frio");
	}

	public static void imprimirPrimavera() {
		System.out.println("É primavera");
		System.out.println("É as folhas estão florindo");
	}
}
