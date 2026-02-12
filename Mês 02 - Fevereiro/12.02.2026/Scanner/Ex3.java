import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner input = new Scanner(System.in);

		System.out.println("Infome a altura da primeira pessoa em metros");
		double altura1 = input.nextDouble();

		System.out.println("Infome a altura da segunda pessoa em metros");
		double altura2 = input.nextDouble();

		double diferencaAlturas = altura1 - altura2;

		System.out.println("A diferença de alturas é de: " + diferencaAlturas + " metros");

	}

}
