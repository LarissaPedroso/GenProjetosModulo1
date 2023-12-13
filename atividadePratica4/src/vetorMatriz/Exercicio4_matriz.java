package vetorMatriz;

public class Exercicio4_matriz {
	public static void main(String[] args) {
		double media;
		double soma = 0;
		double todasMedias[] = new double[10];
		
		double matriz[][] = {	{4.0, 5.0, 7.0, 3.0}, 
								{10.0, 8.5, 9.5, 8.0},
								{9.0, 6.5, 7.6, 8.2},
								{5.0, 5.0, 5.0, 6.3},
								{7.0, 8.0, 9.0, 8.5},
								{5.5, 3.5, 2.5, 1.0},
								{8.0, 9.0, 10.0, 9.5},
								{5.6, 5.8, 6.5, 7.0},
								{7.5, 8.5, 9.5, 10.0}};
								
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 4; j++) {
					soma+=matriz[i][j];
			}
			media = soma / 4;
			todasMedias[i] = media;
			System.out.printf("Média de todos: %.1f\n", todasMedias[i]);
			soma = 0;
		}
	}
}
