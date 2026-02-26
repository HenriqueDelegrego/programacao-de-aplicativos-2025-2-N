import java.util.Scanner;

public class Ex1ComSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número da estação");
		int estacao = input.nextInt();

		switch (estacao) {

		case 1 -> imprimirVerao();

		case 2 -> imprimirOutono();

		case 3 -> imprimirInverno();

		case 4 -> imprimirPrimavera();

		default -> System.out.println("Escolha errada");

		}

	}

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
