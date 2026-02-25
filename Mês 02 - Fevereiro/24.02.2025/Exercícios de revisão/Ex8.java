
public class Ex8 {

	public static void main(String[] args) {

		// Cada linha da matriz representa uma casa, onde a primeira coluna é o tamanho da casa em metros quadrados, a segunda
		int[][] matriz = { { 210, 3, 399900 }, { 160, 3, 329900 }, { 240, 3, 369000 }, { 141, 2, 232000 },
				{ 300, 4, 539900 }, { 198, 4, 299900 }, { 153, 3, 314900 }, { 142, 3, 199000 }, { 138, 3, 212000 },
				{ 149, 3, 242500 }, { 194, 4, 240000 }, { 200, 3, 347000 }, { 189, 3, 330000 }, { 447, 5, 699900 },
				{ 126, 3, 259900 } };

		// Média dos preços das casas

		double somaPrecos = 0;

		for (int i = 0; i < matriz.length; i++) {
			somaPrecos += matriz[i][2];
		}

		int qtdCasas = matriz.length;

		double mediaPrecos = somaPrecos / qtdCasas;

		System.out.println("Média dos preços " + mediaPrecos);

		// Quanto custa a menor casa?

		int menorCasa = Integer.MAX_VALUE;

		int linhaMenorCasa = 0;

		for (int i = 0; i < matriz.length; i++) {

			if (matriz[i][0] < menorCasa) {
				menorCasa = matriz[i][0];
				linhaMenorCasa = i;
			}

		}

		int precoMenorCasa = matriz[linhaMenorCasa][2];

		System.out.println("Preço da menor casa: " + precoMenorCasa);

		// Diferença de tamanho da casa com o maior número de quartos para a casa
		// com o menor número de quartos?

		int maiorQtdQuartos = Integer.MIN_VALUE;
		int menorQtdQuartos = Integer.MAX_VALUE;

		int linhaMenorQtdQuartos = 0;
		int linhaMaiorQtdQuartos = 0;

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][1] > maiorQtdQuartos) {
				maiorQtdQuartos = matriz[i][1];
				linhaMaiorQtdQuartos = i;
			}

			if (matriz[i][1] < menorQtdQuartos) {
				menorQtdQuartos = matriz[i][1];
				linhaMenorQtdQuartos = i;
			}

		}

		int tamCasaMaisQuartos = matriz[linhaMaiorQtdQuartos][0];

		int tamCasaMenosQuartos = matriz[linhaMenorQtdQuartos][0];

		int diferencaTam = tamCasaMaisQuartos - tamCasaMenosQuartos;

		System.out.println("Diferença de tam:" + diferencaTam);

		// Qual a média do tamanho das casas que custam mais de 300.000 mil?

		int somaTamanho = 0;
		int qtdCasas300Mil = 0;

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][2] > 300000) {
				somaTamanho += matriz[i][0];
				qtdCasas300Mil++;
			}
		}

		double mediaCasas300Mil = somaTamanho / qtdCasas300Mil;

		System.out.println("A médias das casas com mais de 300 mil é de: " + mediaCasas300Mil);

	}

}
