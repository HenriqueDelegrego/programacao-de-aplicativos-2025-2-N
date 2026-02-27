
public class ExemploMetodoComParametro {

	/**
	 * Método para somar dois números inteiros
	 * @param num1 - primeiro número inteiro
	 * @param num2 - segundo número inteiro
	 */
	public static void somar(int num1, int num2) {
		int resultado = num1 + num2;
		System.out.println(resultado);
	}

	public static void main(String[] args) {

		// Chamando o método somar com os valores 10 e 8
		somar(10, 8);

	}

}
