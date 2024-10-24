package exercicio;

public class Teorica_01 {
	
	// Função sempre fora do main
	
	void imprimeArray( int[] array) {
		for (int x: array) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		int idades[] = new int [20];
		int i,j;
		
		// matriz
		double [][] notas = new double [3] [2]; //linha e coluna
		double [][] notas2 = { {8.9,3.9}, {9.8,2.0}, {9.9,8.0} } ; //linha e coluna
		
		for(i=0;i < idades.length;i++) {
			
		}
		
		// FOR EACH (substitui o de cima)
		
		for (int x: idades) {
			System.out.println(x);
		}
		
		for (i=0;i<notas.length;i++) {
			for (j=0;i<notas.length;j++) {
				// comando
			}
		}
	
	}

}
