import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// atualização

		System.out.println("Insira o número de matrícula");
		String matricula = input.next();

		System.out.println("Insira a altura do atleta");
		double altura = input.nextDouble();

		double atletaMaisAlto = Double.MIN_VALUE;
		double atletaMaisBaixo = Double.MAX_VALUE;
		String matriculaMaisAlto = "";
		String matriculaMaisBaixo = "";

		double somaAltura = 0;
		int qtdAtletas = 0;

		while (!matricula.equals("0")) {

			if (altura > atletaMaisAlto) {
				atletaMaisAlto = altura;
				matriculaMaisAlto = matricula;
			}
			if (altura < atletaMaisBaixo) {
				atletaMaisBaixo = altura;
				matriculaMaisBaixo = matricula;
			}

			somaAltura += altura;

			qtdAtletas++;

			System.out.println("Insira o número de matrícula");
			matricula = input.next();

			System.out.println("Insira a altura do atleta");
			altura = input.nextDouble();

		}

		double media = somaAltura / qtdAtletas;

		System.out.println("Matrícula atleta mais alto: " + matriculaMaisAlto + "(" + atletaMaisAlto + "m)");
		System.out.println("Matrícula atleta mais baixo: " + matriculaMaisBaixo + "(" + atletaMaisBaixo + "m)");

		System.out.println("Média de altura: " + media);
		System.out.println("Quantidade de atletas cadastrados: " + qtdAtletas);

	}

}
