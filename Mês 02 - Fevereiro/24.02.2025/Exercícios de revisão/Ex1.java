import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		// Scanner para ler os dados do usuário
		Scanner input = new Scanner(System.in);

		// DecimalFormat para formatar o salário mensal com duas casas decimais
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Insira seu número de matrícula");
		String numeroMatricula = input.next();

		System.out.println("Insira seu nome");
		String nome = input.next();

		System.out.println("Insira a quantidade de horas trabalhadas");
		double horasTrabalhadasSemana = input.nextDouble();

		System.out.println("Insira seu salário por hora");
		double salarioHora = input.nextDouble();

		double horasMensais = horasTrabalhadasSemana * 4;

		double salarioMensal = horasMensais * salarioHora;

		// Saída com DecimalFormat para mostrar o salário mensal com duas casas decimais
		System.out.println("O funcionário " + nome + " de matrícula: " + numeroMatricula + " teve um salário de "
				+ df.format(salarioMensal));

	}

}
