package exercicio;

public class Pratica_01 {

	static void somarMatriz(double[][] matriz, double[][] matriz2, double[][] matrizResultado) {
		int i = 0, j = 0;

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz.length; j++) {
				matrizResultado[i][j] = matriz[i][j] + matriz2[i][j];
			}
		}
	}

	static void imprime(double[][] matriz) {
		int i = 0, j = 0;

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");

			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		int i = 0, j = 0;

		// matriz
		double[][] notas = { { 5.9, 1.9, 9.1, 9 }, { 8.9, 2, 3.9, 8 }, { 9.9, 8, 9, 8 }, { 8.9, 9, 8, 4 } }; // linha e
																												// coluna
		double[][] notas2 = { { 9, 8, 6, 8 }, { 8, 9, 6.3, 7 }, { 9, 6.2, 9.8, 5 }, { 8.9, 6, 8, 6 } };
		double[][] nota3 = new double[4][4];
		imprime(notas);
		System.out.println(" ");
		imprime(notas2);

		// soma

		somarMatriz(notas, notas2, nota3);


		System.out.println(" ");
		imprime(nota3);

	}

}
